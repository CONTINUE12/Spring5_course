package com.atguigu.spring5.TestSpring5;

import com.atguigu.spring5.Config.SpringConfig;
import com.atguigu.spring5.Servece.UserServece;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserServece userServece = context.getBean("userServece", UserServece.class);
        System.out.println(userServece);
        userServece.add();
    }

    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserServece userServece = context.getBean("userServece", UserServece.class);
        System.out.println(userServece);
        userServece.add();
    }
}
