package com.flyz.demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 编写切面
 */
public class MyAspectXml {
    /**
     * 前置通知
     * @param joinPoint
     */
    public void checkPri(JoinPoint joinPoint){
        System.out.println("权限校验......"+joinPoint);
    }

    /**
     * 后置通知
     */

    public void writeLog(Object result){
        System.out.println("日志记录''''''"+result);
    }


    /**
     * 环绕通知
     */

    public  Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
            System.out.println("环绕前的通知....");
            Object o  = proceedingJoinPoint.proceed();
            System.out.println("环绕后的通知....");
        return o;
    }


    /**
     * 异常抛出
     */

    public void afterThrowing(Throwable ex){
        System.out.println("异常抛出通知....."+ex.getMessage());
    }

    /**
     * 最终通知
     */
    public void after(){
        System.out.println("最终通知===========");
    }
}
