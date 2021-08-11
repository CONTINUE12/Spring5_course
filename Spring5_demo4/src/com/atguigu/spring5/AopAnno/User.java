package com.atguigu.spring5.AopAnno;

import org.springframework.stereotype.Component;

//被增强类
@Component
public class User {

    public void add() {
//        int a = 10/0; //测试异常通知
        System.out.println("add......");
    }
}
