package com.sevenhome.service.impl;

import com.sevenhome.bean.po.UserOnline;
import com.sevenhome.dao.UserOnlineDao;
import com.sevenhome.service.IUserOnlineService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserOnlineService implements IUserOnlineService {
    @Resource
    private UserOnlineDao userOnlineDao;

    /**
     * 登录查询
     * @param username
     * @param password
     * @return
     */
    @Override
    public UserOnline getLogin(String username, String password) {
        return userOnlineDao.getLogin(username, password);
    }
}
