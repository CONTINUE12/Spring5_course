package com.atguigu.spring5.Dao;

import com.atguigu.spring5.entity.Book;

import java.util.List;

public interface BookDao {
    //添加的方法
    void add(Book book);
    //修改的方法
    void update(Book book);
    //删除的方法
    void delete(String id);
    //查询方法
    int selectCount();
    //  查询对象
    Book selectOne(String id);
    //查询集合
    List selectAll();
    //批量添加
    void batchAddBook(List<Object[]> batchArgs);
    //批量修改
    void batchUpdateBook(List<Object[]> batchArgs);
    //批量删除
    void batchDeleteBook(List<Object[]> batchArgs);
}
