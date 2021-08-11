package com.atguigu.spring5.test;

//完全注解开发配置文件

import com.atguigu.spring5.Service.UserService;
import com.atguigu.spring5.config.TxConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void testAccount1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.userAccount();
    }

    @Test
    public void testAccount2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.userAccount();
    }

    @Test
    public void testAccount3() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.userAccount();
    }
}
