package com.flyz.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspectAnno {

//    @Before(value = "execution(* com.flyz.demo1.OrderDao.save(..))")
//    public void before(){
//        System.out.println("前置增强...........");
//    }
//
//    @AfterReturning(value = "execution(* com.flyz.demo1.OrderDao.delete(..))",returning = "result")
//    public void afterRetruning(Object result){
//        System.out.println("后置增强..........."+result);
//    }
//
//
//    @Around(value = "execution(* com.flyz.demo1.OrderDao.update(..))")
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
//        System.out.println("环绕前增强.............");
//        Object o =  joinPoint.proceed();
//        System.out.println("环绕后增强.............");
//        return o;
//    }
//
//
//    @AfterThrowing(value = "execution(* com.flyz.demo1.OrderDao.find(..))",throwing = "e")
//    public void afterThrowing(Throwable e){
//        System.out.println("异常抛出增强..........."+e.getMessage());
//    }

//
//    @After(value = "execution(* com.flyz.demo1.OrderDao.find(..))")
//    public void after(){
//        System.out.println("最终通知增强...........");
//
//    }






    @After(value = "MyAspectAnno.pointcut1()")
    public void after(){
        System.out.println("最终通知增强...........");

    }

    @AfterThrowing(value = "MyAspectAnno.pointcut1()",throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("异常抛出增强..........."+e.getMessage());
    }

    @Before(value = "MyAspectAnno.pointcut2())")
    public void before(){
        System.out.println("前置增强...........");
    }

    @AfterReturning(value = "MyAspectAnno.pointcut4()",returning = "result")
    public void afterRetruning(Object result){
        System.out.println("后置增强..........."+result);
    }

    @Around(value = "MyAspectAnno.pointcut3()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕前增强.............");
        Object o =  joinPoint.proceed();
        System.out.println("环绕后增强.............");
        return o;
    }





//    切入点注解,改方法无实际意义
    @Pointcut(value = "execution(* com.flyz.demo1.OrderDao.find(..))")
    public void pointcut1(){ }
    @Pointcut(value = "execution(* com.flyz.demo1.OrderDao.save(..))")
    public void pointcut2(){ }
    @Pointcut(value = "execution(* com.flyz.demo1.OrderDao.update(..))")
    public void pointcut3(){ }
    @Pointcut(value = "execution(* com.flyz.demo1.OrderDao.delete(..))")
    public void pointcut4(){ }
}
