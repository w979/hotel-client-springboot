package com.sevenhome.service.impl;

import com.sevenhome.bean.fo.SubscribeFo;
import com.sevenhome.dao.SubscribeDao;
import com.sevenhome.service.ISubscribeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class SubscribeService implements ISubscribeService {
    @Resource
    SubscribeDao subscribeDao;


    @Override
    public int insertSubscribe(SubscribeFo subscribeFo) {
        return 0;
    }
}