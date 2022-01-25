package com.sevenhome.service.impl;

import com.sevenhome.bean.po.Vip;
import com.sevenhome.dao.VipDao;
import com.sevenhome.service.IVipService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class VipService implements IVipService {

    @Resource
    private VipDao vipDao;

    @Override
    public Vip getVip(Integer useronlineid) {
        return vipDao.getVipByUserId(useronlineid);
    }
}
