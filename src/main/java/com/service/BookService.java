package com.service;

import com.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {


    //增加一本书
    int addBook(Books books);

    //删除
    int deleteBookById(@Param("bookID") int id);

    //更新
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("bookID") int id);

    //查询全部的书
    List<Books> queryAllBook();
}
