package com.example.ensystem2.serviceimpl;

import com.example.ensystem2.bean.user;
import com.example.ensystem2.mapper.usermapper;
import com.example.ensystem2.service.userservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Userserviceimpl implements userservice {
    @Resource
    private usermapper usermapper;

    public user logIn(String UserName, String PassWord)
    {
        return usermapper.getInfo(UserName, PassWord);
    }
}