package com.flyz.demo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("customService")
@Scope("prototype")
public class CustomServcie {

    @PostConstruct // 相当于 init-method
    public void init(){
        System.out.println("CustomServcie  init  方法被执行了....");
    }

    public void save(){
        System.out.println("CustomServcie  save  方法被执行了....");

    }

    @PreDestroy  // 相当于destory
    public void destory(){
        System.out.println("CustomServcie  destory  方法被执行了....");

    }
}
