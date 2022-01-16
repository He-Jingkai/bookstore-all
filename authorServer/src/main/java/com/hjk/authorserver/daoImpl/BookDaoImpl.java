package com.hjk.authorserver.daoImpl;

import com.hjk.authorserver.dao.BookDao;
import com.hjk.authorserver.entity.Book;
import com.hjk.authorserver.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> findBooksByTitle(String title){return bookRepository.findBooksByTitle(title);}

}
