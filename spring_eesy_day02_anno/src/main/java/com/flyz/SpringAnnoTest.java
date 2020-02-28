package com.flyz;

import com.flyz.demo1.UserDao;
import com.flyz.demo1.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnoTest {

    @Test
    public void demo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.save();
        System.out.println(userDao.toString());

        UserService service = (UserService) context.getBean("userService");
        service.save();
    }
}
