package com.atguigu.spring5;

public class Orders {

    private String border;
    private String address;

    public Orders(String border, String address) {
        this.border = border;
        this.address = address;
    }

    public void testOrder(){
        System.out.println(border + "::" + address);
    }
}
