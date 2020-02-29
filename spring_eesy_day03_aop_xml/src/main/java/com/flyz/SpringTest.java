package com.flyz;

import com.flyz.demo1.JDKProxy;
import com.flyz.demo1.UserDao;
import com.flyz.demo1.UserDaoImpl;
import com.flyz.demo2.CglibProxy;
import com.flyz.demo2.CustomDao;
import org.junit.Test;

public class SpringTest {

    /**
     * jdk 动态代理
     */
    @Test
    public void demo1(){

        UserDao userDao = new UserDaoImpl();
        UserDao proxy = new JDKProxy(userDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.find();
        proxy.delete();
    }


    /**
     * cglib动态代理
     */
    @Test
    public void demo2(){

        CustomDao customDao = new CustomDao();
        CustomDao proxy = new CglibProxy(customDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.find();
        proxy.delete();
    }


    /**
     * spring aop入门
     */
    @Test
    public void demo3(){


    }
}
