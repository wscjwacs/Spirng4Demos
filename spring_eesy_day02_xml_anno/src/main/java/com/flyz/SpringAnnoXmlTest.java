package com.flyz;

import com.flyz.demo1.ProductService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnoXmlTest {

    @Test
    public void demo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService service = (ProductService) context.getBean("productService");
        service.save();
    }



}
