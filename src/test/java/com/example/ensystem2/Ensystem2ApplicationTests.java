package com.example.ensystem2;

import com.example.ensystem2.bean.user;
import com.example.ensystem2.bean.product;
import com.example.ensystem2.service.userservice;
import com.example.ensystem2.service.productservice;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class Ensystem2ApplicationTests {
    @Resource
    userservice userService;
    productservice proService;
    @Test
    void contextLoads() {
//        List probean = proService.showall();
//        for(int i=0;i<probean.size();i++)
//            System.out.println(proService.showall().get(i).getpName());
        user userbean = userService.logIn("Diluc","diluc03");
        System.out.println("user sex is: ");
        System.out.println(userbean.getSex());
    }
}
