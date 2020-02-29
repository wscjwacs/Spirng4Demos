package com.flyz.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {


    private UserDao userDao;
    public JDKProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 产生userDao代理的方法
     * @return
     */
    public UserDao createProxy(){

         UserDao userProxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),
                 userDao.getClass().getInterfaces(), new InvocationHandler() {
             @Override
             public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                 if ("save".equals(method.getName())){

                     //增强：
                     System.out.println("权限校验........");
                     return method.invoke(userDao,args);
                 }
                 return method.invoke(userDao,args);
             }
         });
        return userProxy;
    }
}
