package com.flyz.demo1;


import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private OrderDao orderDao;


    public void save(){
        System.out.println("ProductService  save  方法被执行了......");
        productDao.save();
        orderDao.save();

    }
}
