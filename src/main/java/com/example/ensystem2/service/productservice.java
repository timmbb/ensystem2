package com.example.ensystem2.service;

import com.example.ensystem2.bean.product;
import java.util.List;
import java.util.ArrayList;

public interface productservice {
    List<product> showall();

    product findproductById(String id);
}
