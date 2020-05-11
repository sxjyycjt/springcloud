package com.jiangtong.service;

import com.jiangtong.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getBookList();

    Book getBookById(Integer id);
}
