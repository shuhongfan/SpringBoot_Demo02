package com.shf.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
class Spring03WebAdminApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowiredx
    DataSource dataSource;


    @Test
    void contextLoads() {
        Long count = jdbcTemplate.queryForObject("select count(*) from account",Long.class);
        System.out.printf(String.valueOf(count));
        System.out.println(dataSource);
    }


}
