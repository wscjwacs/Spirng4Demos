package com.flyz.demo3;

public class ProductDaoImpl implements ProductDao {

    @Override
    public void save() {
        System.out.println("增加用户...");
    }

    @Override
    public void update() {
        System.out.println("修改用户...");

    }

    @Override
    public void find() {
        System.out.println("查找用户...");
        //int i = 1/0;

    }

    @Override
    public String delete() {
        System.out.println("删除用户...");

        return "哈哈哈";
    }
}
