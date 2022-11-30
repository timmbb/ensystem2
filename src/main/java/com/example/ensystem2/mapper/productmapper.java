package com.example.ensystem2.mapper;

import com.example.ensystem2.bean.product;
import java.util.List;
public interface productmapper {
    List<product> getall();

    product findproductById(String id);
}
