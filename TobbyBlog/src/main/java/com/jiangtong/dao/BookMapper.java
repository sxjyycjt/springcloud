package com.jiangtong.dao;

import com.jiangtong.entity.Book;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Repository
public interface BookMapper extends MySqlMapper<Book>, Mapper<Book> {
}