package com.atguigu.spring5.AopAnno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {

    //前置通知
    //before注解表示前置通知
    @Before(value = "execution(* com.atguigu.spring5.AopAnno.User.add(..))")
    public void before() {
        System.out.println("Person before......");
    }
}
