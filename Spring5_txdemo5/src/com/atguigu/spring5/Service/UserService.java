package com.atguigu.spring5.Service;

import com.atguigu.spring5.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional() //开启事务管理器(括号中可配置隔离级别、传播行为、超时、是否回滚等操作)
public class UserService {

    @Autowired
    private UserDao userDao;

    //转账的方法
    public void userAccount() {
        //lucy少100
        userDao.reduceMoney();

        int a = 10/0;

        //mary多100
        userDao.addMoney();
    }

}
