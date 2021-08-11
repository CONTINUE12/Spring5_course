package com.atguigu.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces,new UserDaoProxy(userDao));
        int result = dao.add(1,2);
        System.out.println("result:"+ result);
    }
}

class UserDaoProxy implements InvocationHandler {

    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前执行
        System.out.println("方法之前执行。。。" + method.getName() + "传递的参数：" + Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(obj,args);

        //方法之后执行
        System.out.println("方法之后执行。。。" + obj);

        return res;
    }
}