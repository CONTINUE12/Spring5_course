package com.atguigu.spring5.bean;

import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.jws.Oneway;

public class MyBeanPost implements BeanPostProcessor {

    @Override
    public java.lang.Object postProcessBeforeInitialization(java.lang.Object bean, java.lang.String beanName) throws org.springframework.beans.BeansException {
        /* compiled code */
        System.out.println("初始化之前执行");
        return bean;
    }

    @Override
    public java.lang.Object postProcessAfterInitialization(java.lang.Object bean, java.lang.String beanName) throws org.springframework.beans.BeansException {
        /* compiled code */
        System.out.println("初始化之后执行");
        return bean;
    }

}
