package com.atguigu.spring5.entity;

public class Book {

    private String userId;
    private String username;
    private String ustatus;

    @Override
    public String toString() {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }

    //set方法
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    //get方法
    public String getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public String getUstatus() {
        return ustatus;
    }
}
