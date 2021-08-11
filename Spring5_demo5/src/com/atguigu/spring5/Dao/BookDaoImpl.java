package com.atguigu.spring5.Dao;

import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    //注入jdbctemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(Book book) {
        //创建sql语句
        String sql = "insert into t_book value(?,?,?)";
        //调用方法实现
        Object[] args = {book.getUserId(),book.getUsername(),book.getUstatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void update(Book book) {
        String sql = "update t_book set username=?, ustatus=? where user_id=?";
        Object[] args = {book.getUsername(),book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from t_book where user_id=?";
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    @Override
    public Book selectOne(String id) {
        String sql = "select * from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

    //查询集合
    @Override
    public List selectAll() {
        String sql = "select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book value(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    //批量修改
    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?, ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(ints);
    }

    //批量删除
    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql = "delete from t_book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(ints);
    }

}
