package com.hjk.authorserver.dao;

import com.hjk.authorserver.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> findBooksByTitle(String title);
}
