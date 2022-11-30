package com.example.ensystem2.serviceimpl;

import com.example.ensystem2.bean.product;
import com.example.ensystem2.mapper.productmapper;
import com.example.ensystem2.service.productservice;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

@Service
public class Productserviceimpl implements productservice{
    @Resource
    private productmapper productmapper;

    public List <product> showall() {
        return productmapper.getall();
    }
    public product findproductById(String id){
        return productmapper.findproductById(id);
    }
}
