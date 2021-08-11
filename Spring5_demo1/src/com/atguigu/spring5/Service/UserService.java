package com.atguigu.spring5.Service;

import com.atguigu.spring5.Dao.UserDao;
import com.atguigu.spring5.Dao.UserDaoImpl;

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.......");

        userDao.update();
    }


}
