package com.nuesoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nuesoft.dao")
public class Springbootbaits20190327Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootbaits20190327Application.class, args);
    }

}
