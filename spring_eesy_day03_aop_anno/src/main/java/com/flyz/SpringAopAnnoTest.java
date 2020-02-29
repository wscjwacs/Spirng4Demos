package com.flyz;

import com.flyz.demo1.OrderDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringAopAnnoTest {


    @Resource(name = "orderDao")
    OrderDao orderDao;
    @Test
    public void demo1(){
        orderDao.save();
        orderDao.update();
        orderDao.find();
        orderDao.delete();
    }
}
