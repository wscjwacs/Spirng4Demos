package com.flyz.demo2;

public class CustomDaoImpl implements CustomDao {

    public  void init() {
        System.out.println("init 方法被执行了.....");

    }
    @Override
    public void save() {
        System.out.println("CustomDaoImpl 方法被执行了.....");
    }

    public void destory(){
        System.out.println("destory 方法被执行了.....");

    }
}
