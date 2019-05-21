package com.example.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@MapperScan("com.example.crm.dao")
public class CrmApplication {

    public static void main(String[] args) {

        SpringApplication.run(CrmApplication.class, args);
    }

}
