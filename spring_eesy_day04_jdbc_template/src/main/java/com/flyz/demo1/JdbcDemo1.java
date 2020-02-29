package com.flyz.demo1;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * jdbc模板的使用
 */
public class JdbcDemo1 {

    @Test
    public void demo1(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///spring4_day03?characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("wscjwacs");
        JdbcTemplate jdbcTemplate  = new JdbcTemplate(dataSource);
        jdbcTemplate.update("insert into account values (null ,?,?)","jerry",20000d);
    }


}
