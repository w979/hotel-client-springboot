package com.sevenhome.service;

import com.sevenhome.bean.po.UserOnline;

public interface IUserOnlineService {
    //登录查询
    UserOnline getLogin(String username,String password);
}
