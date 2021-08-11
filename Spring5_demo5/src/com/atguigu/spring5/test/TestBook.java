package com.atguigu.spring5.test;

import com.atguigu.spring5.Service.BookService;
import com.atguigu.spring5.entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        //数据库添加操作
//        Book book = new Book();
//        book.setUserId("2");
//        book.setUsername("python");
//        book.setUstatus("a");
//        bookService.addBook(book);

        //数据库修改操作
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java plus");
//        book.setUstatus("atguigu");
//        bookService.updateBook(book);

        //数据库删除操作
//        bookService.deleteBook("2");

        //数据库查询某个值操作
//        int count = bookService.findCount();
//        System.out.println(count);

        //数据库查询对象操作
//        Book book = bookService.findOne("1");
//        System.out.println(book);

        //数据库查询集合操作
//        List<Book> All = bookService.findAll();
//        System.out.println(All);

        //数据库批量添加操作
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"3","c++","a"};
//        Object[] o2 = {"4","html","b"};
//        Object[] o3 = {"5","go","c"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

        //数据库批量修改操作
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"c++","a1","3"};
//        Object[] o2 = {"html","b1","4"};
//        Object[] o3 = {"go","c1","5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

        //数据库批量删除操作
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        bookService.batchDelete(batchArgs);
    }
}
