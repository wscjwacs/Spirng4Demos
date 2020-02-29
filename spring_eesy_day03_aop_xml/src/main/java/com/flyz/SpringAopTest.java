package com.flyz;

import com.flyz.demo3.ProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringAopTest {

    @Resource(name = "productDao")
    ProductDao productDao;
    @Test
    public void demo3(){
        productDao.save();
        productDao.update();
        productDao.find();
        productDao.delete();
    }
}
