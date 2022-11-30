package com.example.ensystem2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ensystem2.mapper")
public class Ensystem2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ensystem2Application.class, args);
    }

}
