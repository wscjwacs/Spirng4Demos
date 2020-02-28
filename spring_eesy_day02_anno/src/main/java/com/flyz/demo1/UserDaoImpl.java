package com.flyz.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component(value = "userDao")
@Component("userDao") /**相当于    <bean id="userDao" class="com.flyz.demo1.UserDaoImpl"></bean> **/
public class UserDaoImpl implements UserDao {

    /**
     * 1.  如果name有set 方法 ，则讲注解添加到set方法上面
     * 2.  如果name没有set 方法 ，则讲注解添加属性上面
     * 3.  对象类型的属性 Autowired :  是按照类型来注入的
     * @param name
     */

    private String name;
    @Value("jerry")
    public void setName(String name) {
        this.name = name;
    }


    @Value("2000")
    private Double age;

    @Override
    public void save() {
        System.out.println("注解实现了");
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }
}
