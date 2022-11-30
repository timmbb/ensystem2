package com.example.ensystem2.controller;

import com.example.ensystem2.bean.user;
import com.example.ensystem2.service.userservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;

@Controller
public class loginController {
    @Resource
    userservice userService;

    @RequestMapping("/admin_login")
    public String show(){return "admin_login";}

    @RequestMapping(value = "/logIn",method = RequestMethod.POST)
    public String loginMethod(String UserName,String PassWord)
    {
        user userBean=userService.logIn(UserName, PassWord);//
        if (userBean!=null)
            return "ad_customer";
        else return "error";
    }
}
