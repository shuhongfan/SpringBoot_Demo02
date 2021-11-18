package com.shf.boot.controller;

import com.shf.boot.bean.Car;
import com.shf.boot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @Autowired
    Car car;

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String hello01() {
        log.info("请求进来了");
        return "hello,spring boot 2";
    }

    @RequestMapping("/car")
    public Car car() {
        return car;
    }


    @RequestMapping("/person")
    public Person person() {
        return person;
    }
}
