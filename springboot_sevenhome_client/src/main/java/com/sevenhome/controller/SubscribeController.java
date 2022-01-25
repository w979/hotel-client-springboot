package com.sevenhome.controller;

import com.sevenhome.bean.fo.SubscribeFo;
import com.sevenhome.bean.po.RoomType;
import com.sevenhome.bean.po.Vip;
import com.sevenhome.service.IRoomTypeService;
import com.sevenhome.service.IVipService;
import com.sevenhome.service.impl.OrdersService;
import com.sevenhome.utils.ResponseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SubscribeController {
    @Resource
    private IRoomTypeService roomTypeService;

    @Resource
    private IVipService vipService;

    @Resource
    private OrdersService ordersService;

    /**
     * 房间列表
     * @return
     */
    @GetMapping("subscribe/roomType")
    public ResponseResult<Object> roomTypeList(){
        List<RoomType> roomTypeList = roomTypeService.getRoomTypeList();
        return new ResponseResult<>(200, "房间类型列表",roomTypeList);
    }

    /**
     * 查vip
     * @return
     */
    @GetMapping("subscribe/vip")
    public ResponseResult<Object> getuservip(@RequestParam("id") Integer id){
        Vip vip = vipService.getVip(id);
        return new ResponseResult<>(200, "当前用户VIP类型",vip);
    }

    /**
     * 查价格
     * @return
     */
    @GetMapping("subscribe/price")
    public ResponseResult<Object> getPrice(@RequestParam("id") Integer id){
        RoomType roomType = roomTypeService.getPrice(id);
        return new ResponseResult<>(200, "当前房间信息",roomType);
    }

    /**
     * 添加预约
     * @return
     */
    @PostMapping("subscribe/add")
    public ResponseResult<Void> addSubscribeOnline(@RequestBody SubscribeFo subscribeFo) {
        subscribeFo.setSubscribeStatus(1);
        subscribeFo.setSubscribeOrigin(1);
        int n = ordersService.insertOrder(subscribeFo);
        if (n > 0) {
            return new ResponseResult<Void>(200, "ok");
        } else {
            return new ResponseResult<Void>(500, "fail");
        }
    }
}
