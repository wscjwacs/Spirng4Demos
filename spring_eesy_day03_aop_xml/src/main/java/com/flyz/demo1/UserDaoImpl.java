package com.flyz.demo1;

public class UserDaoImpl  implements UserDao{
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

    }

    @Override
    public void delete() {
        System.out.println("删除用户...");

    }
}
