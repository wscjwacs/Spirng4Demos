package com.flyz.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;


    @Override
    public void save() {
        System.out.println("UserServiceImpl 的save 方法执行了.....");
        userDao.save();
    }
}
