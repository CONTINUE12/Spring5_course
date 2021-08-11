package com.atguigu.spring5.Servece;

import com.atguigu.spring5.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component(value = "userServece") //括号里默认
@Service
public class UserServece {

    @Value(value = "abc") //注入普通属性类型
    private String name;;

//    @Autowired //根据类型注入
//    @Qualifier(value = "userDaoTmp") //根据名称注入
//    private UserDao userDao;

//    @Resource
    @Resource(name = "userDaoTmp")  //可根据类型注入也可根绝名称注入
    private UserDao userDao;

    public void add() {
        System.out.println("add........" + name);
        userDao.add();
    }
}
