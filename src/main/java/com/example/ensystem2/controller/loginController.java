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

    @RequestMapping("/sal_login")
    public String show(){return "sal_login";}

    @RequestMapping(value = "/logIn",method = RequestMethod.POST)
    public String loginMethod(String UserName,String PassWord){
        user userbean=userService.logIn(UserName, PassWord);
        if (userbean!=null)
            return "success";
        else
            return "error";
    }
}
