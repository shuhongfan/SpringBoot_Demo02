package com.shf.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ServletComponentScan(basePackages = "com.shf.spring.servlet")
@MapperScan("com.shf.spring.mapper")
@SpringBootApplication
public class Spring03WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring03WebAdminApplication.class, args);
    }

}
