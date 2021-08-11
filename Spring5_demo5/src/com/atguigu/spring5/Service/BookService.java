package com.atguigu.spring5.Service;

import com.atguigu.spring5.Dao.BookDao;
import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    //注入Dao
    @Autowired
    private BookDao bookDao;

    //添加方法
    public void addBook(Book book) {
        bookDao.add(book);
    }
    //修改方法
    public void updateBook(Book book) {
        bookDao.update(book);
    }
    //删除方法
    public void deleteBook(String id) {
        bookDao.delete(id);
    }
    //查询某个值方法
    public int findCount() {
        return bookDao.selectCount();
    }
    //查询对象
    public Book findOne(String id) {
        return bookDao.selectOne(id);
    }
    //查询集合
    public List findAll() {
        return bookDao.selectAll();
    }
    //批量添加
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }
    //批量修改
    public void batchUpdate(List<Object[]> batchArgs) {
        bookDao.batchUpdateBook(batchArgs);
    }
    //批量删除
    public void batchDelete(List<Object[]> batchArgs) {
        bookDao.batchDeleteBook(batchArgs);
    }


}
