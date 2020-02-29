package com.flyz.demo1;

public class OrderDao {

    public void save() {
        System.out.println("增加订单...");
    }

    public void update() {
        System.out.println("修改订单...");

    }

    public void find() {
        System.out.println("查找订单...");
       // int i = 1/0;

    }

    public String delete() {
        System.out.println("删除订单...");

        return "测试123";
    }
    
}
