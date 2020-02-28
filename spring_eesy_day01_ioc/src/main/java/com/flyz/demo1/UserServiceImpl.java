package com.flyz.demo1;

public class UserServiceImpl implements UserService {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    @Override
    public void save() {
        System.out.println("save  方法被执行了....");
    }
}
