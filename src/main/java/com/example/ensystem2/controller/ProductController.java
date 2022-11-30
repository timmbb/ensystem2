package com.example.ensystem2.controller;
  /*
import com.example.ensystem2.bean.product;
import com.example.ensystem2.bean.user;
import com.example.ensystem2.service.productservice;
import com.example.ensystem2.service.userservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;

@Controller
public class ProductController {
    @Resource
    userservice userService;
    productservice productService;

    /*
      根据id查询用户
     */
  /*
    @GetMapping("/findproductById/{id}")
    public String findProductById(@PathVariable String id){
        product res =  productService.findproductById(id);
        if (res == 0) {
            return "no";
        } else {
            return "redirect:/List";
        }

    }
}
        */