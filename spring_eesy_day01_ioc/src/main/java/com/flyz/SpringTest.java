package com.flyz;

import com.flyz.demo1.UserService;
import com.flyz.demo1.UserServiceImpl;
import com.flyz.demo2.CustomDaoImpl;
import com.flyz.demo4.Car;
import com.flyz.demo4.Car2;
import com.flyz.demo5.Employee;
import com.flyz.demo6.Car3;
import com.flyz.demo6.Employee2;
import com.flyz.demo7.CarInfo;
import com.flyz.demo8.CollectionBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {


    /**
     * 基础测试
     */
    @Test
    public void demo1(){
        ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
//        UserServiceImpl service = (UserServiceImpl) context.getBean("service");
//        service.save();
//        System.out.println(service.getName());


    }


    /**
     * 生命周期测试
     */
    @Test
    public void demo3(){
        ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
        CustomDaoImpl customDao = (CustomDaoImpl) context.getBean("customDao");
        customDao.save();

        Car car = (Car) context.getBean("car");
        System.out.println("car = "+car.toString());
        ((ClassPathXmlApplicationContext) context).close();
    }


    /**
     * 构造参数赋值
     */
    @Test
     public void demo4(){
         ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
         Car car = (Car) context.getBean("car");
         System.out.println("car = "+car.toString());
     }


    /**
     * set方法赋值
     */
    @Test
    public void demo5(){
        ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
        Car2 car = (Car2) context.getBean("car2");
        System.out.println("car = "+car.toString());
    }


    /**
     * 参数为引用类型方法赋值
     */
    @Test
    public void demo6(){
        ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
        Employee emp = (Employee) context.getBean("emp");
        System.out.println("emp = "+emp.toString());
    }


    /**
     * p名称空间属性注入
     */
    @Test
    public void demo7(){
        ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
        Car3 car3 = (Car3) context.getBean("car3");
        System.out.println("emp = "+car3.toString());

        Employee2 employee2 = (Employee2) context.getBean("employee2");
        System.out.println("employee2 = "+employee2.toString());

    }


    /**
     * spEL
     */
    @Test
    public void demo8(){
        ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) context.getBean("car4");
        System.out.println("car = "+car.toString());

        Employee employee2 = (Employee) context.getBean("emp3");
        System.out.println("employee2 = "+employee2.toString());


        CarInfo  carInfo = (CarInfo) context.getBean("carinfo");
        System.out.println("carInfo = "+carInfo.toString());

    }



    /**
     * 集合类型的注入
     */
    @Test
    public void demo9(){
        ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collcetion = (CollectionBean) context.getBean("collcetion");
        System.out.println("collcetion = "+collcetion.toString());

    }
}
