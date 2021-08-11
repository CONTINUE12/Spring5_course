package com.atguigu.spring5.collectionType;

import java.util.List;

public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void Test(){
        System.out.println(list);
    }
}
