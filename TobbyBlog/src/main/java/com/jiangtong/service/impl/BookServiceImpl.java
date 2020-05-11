package com.jiangtong.service.impl;

import com.jiangtong.dao.BookMapper;
import com.jiangtong.entity.Book;
import com.jiangtong.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> getBookList(){

        return bookMapper.selectAll();
    }

    @Override
    public Book getBookById(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }
}
