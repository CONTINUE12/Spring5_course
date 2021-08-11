package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Service.UserService;
import com.atguigu.spring5.User;
import com.atguigu.spring5.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testbean2(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testbean3(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }

    @Test
    public void testbean4(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }

}
