package com.flyz;

import com.flyz.demo1.UserDao;
import com.flyz.demo1.UserService;
import com.flyz.demo2.CustomServcie;
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



    @Test
    public void demo2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomServcie customServcie = (CustomServcie) context.getBean("customService");
        System.out.println("========================="+customServcie.toString());

        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomServcie customServcie2 = (CustomServcie) context2.getBean("customService");
        System.out.println("========================="+customServcie2.toString());
      }
}
