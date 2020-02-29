package com.flyz.demo2;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class CglibProxy {

    private CustomDao customDao;
    public CglibProxy(CustomDao customDao) {

        this.customDao = customDao;
    }

    public CustomDao createProxy(){

        //cglib核心类对象
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(customDao.getClass());
        //设置回调
        enhancer.setCallback((MethodInterceptor) (proxy, method, args, methodProxy) -> {
            //判断方法是否为save
            if ("save".equals(method.getName())){
                //增强
                System.out.println("权限校验.............");
                return  methodProxy.invokeSuper(proxy,args);
            }

            return  methodProxy.invokeSuper(proxy,args);
        });

        return (CustomDao) enhancer.create();
    }
}
