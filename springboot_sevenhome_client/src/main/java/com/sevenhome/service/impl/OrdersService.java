package com.sevenhome.service.impl;

import com.sevenhome.bean.fo.SubscribeFo;
import com.sevenhome.bean.po.*;
import com.sevenhome.dao.*;
import com.sevenhome.service.IOrdersService;
import com.sevenhome.utils.RandomCode;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 何好
 */
@Service
@Transactional
public class OrdersService implements IOrdersService {
    @Resource
    private OrdersDao ordersDao;

    @Resource
    private RoomDao roomDao;

    @Resource
    private RoomStatusDao roomStatusDao;
    @Resource
    private EmployeeDao employeeDao;
    @Resource
    private SubscribeDao subscribeDao;

    @Resource
    private DepositDao depositDao;

    /**
     * 插入订单表数据
     * @param subscribeFo
     * @return
     */
    @Override
    public int insertOrder(SubscribeFo subscribeFo) {

        Subscribe subscribe = new Subscribe();
        BeanUtils.copyProperties(subscribeFo, subscribe);
        subscribeDao.insertSelective(subscribe);
        List<Employee> employeeList = employeeDao.getEmployee(subscribe.getEmployeeId());
        Employee employee = employeeList.get(0);
        List<RoomStatus> roomStatusList = roomStatusDao.getRoomStatusByTime(subscribe.getSubscribeIntime(), subscribe.getSubscribeLeavetime());
        List<Integer> ids = new ArrayList<>();
        for(RoomStatus roomStatus:roomStatusList){
            ids.add(roomStatus.getRoomId());
        }

        Room roomType = roomDao.getRoomGroupBy(employee.getHotelId(), subscribe.getRoomtypeId(), ids);

        System.out.println("roomType=>"+roomType);

        Room roomId = roomDao.getOneRoomId(roomType.getRoomtypeId(), ids);
        System.out.println("roomId=>"+roomId);
        System.out.println("roomID=>"+roomId.getId());

        Orders orders = new Orders();
        orders.setOrderno(RandomCode.getNo());
        Subscribe getTotal = subscribeDao.getSubscribeByName(subscribe.getSubscribeName(),subscribe.getId());
        BigDecimal totalPrice = getTotal.getSubscribeDeposit().add(getTotal.getSubscribeRoomrate());
        orders.setSubscribeId(subscribe.getId());
        orders.setOrderTotalprice(totalPrice);
        orders.setOrderStatus("3");
        orders.setOrderGeneratetime(new Date());
        orders.setRoomId(roomId.getId());
        int n = ordersDao.insertSelective(orders);
         //预订后向房态表插入记录

        //预订后向房态表插入记录
        Date intime = subscribeFo.getSubscribeIntime();
        Long leavetime = subscribeFo.getSubscribeLeavetime().getTime()-24*60*60*1000;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date finalLeaveTime = new Date(leavetime);
        String formatIntime = sdf.format(intime);
        String formatLeavetime = sdf.format(finalLeaveTime);
        List<RoomStatus> statusList = roomStatusDao.findRoomStatus(roomId.getId(), formatIntime, formatLeavetime);
        List<Integer> roomIds = new ArrayList<>();
        for(RoomStatus roomStatus:statusList){
            roomIds.add(roomStatus.getId());
        }
        System.out.println(roomIds);
        roomStatusDao.updateRoomStatus(roomIds);

//         RoomStatus roomStatus = new RoomStatus();
//         roomStatus.setRoomId(roomId.getId());
//         roomStatus.setRoomstatus(1);
//         roomStatus.setRoomstatusDate(new Date());
//         roomStatusDao.insertSelective(roomStatus);

        //押金表插入数据
        Deposit deposit = new Deposit();
        deposit.setOrderId(orders.getId());
        deposit.setDepositReturnmoney(new BigDecimal(100));
        deposit.setDepositTotal(new BigDecimal(100));
        deposit.setStatus("n");
        deposit.setRoomgoodsTotal(new BigDecimal(0));
        depositDao.insertSelective(deposit);

        return n;
    }



}
