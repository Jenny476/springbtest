package com.wul.springbtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wul.springbtest.mapper")
public class SpringbtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbtestApplication.class, args);
    }

}
