package com.atguigu.spring5.Dao;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository(value = "userDaoTmp")
public class UserDaoTmp implements UserDao {

    @Override
    public void add() {
        System.out.println("dao add,,,");

    }
}
