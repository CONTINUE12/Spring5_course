package com.atguigu.spring5.AopAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect //生成代理对象
@Order(2) //增强优先级
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.atguigu.spring5.AopAnno.User.add(..))")
    public void pointcut() {

    }

    //前置通知
    //before注解表示前置通知
    @Before(value = "pointcut()")
    public void before() {
        System.out.println("before......");
    }

    //最终通知
    @After(value = "execution(* com.atguigu.spring5.AopAnno.User.add(..))")
    public void after() {
        System.out.println("after......");
    }

    @AfterReturning(value = "execution(* com.atguigu.spring5.AopAnno.User.add(..))")
    public void afterreturning() {
        System.out.println("after returning......");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.atguigu.spring5.AopAnno.User.add(..))")
    public void AfterThrowing() {
        System.out.println("After Throwing......");
    }

    //环绕通知
    @Around(value = "execution(* com.atguigu.spring5.AopAnno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("环绕之前......");

        //被增强的方法下执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后......");
    }

}
