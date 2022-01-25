package com.sevenhome.controller;

import com.sevenhome.bean.po.UserOnline;
import com.sevenhome.service.IUserOnlineService;
import com.sevenhome.utils.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {
    @Resource
    private IUserOnlineService userOnlineService;

    @GetMapping("login")
    private ResponseResult<Object> getLogin(@RequestParam("username") String username,@RequestParam("password") String password){

        UserOnline userOnline = userOnlineService.getLogin(username, password);
        if (userOnline != null){
            return new ResponseResult<>(200, "登录成功",userOnline);
        }else {
            return new ResponseResult<>(200, "账号或密码有误");
        }
    }
}
