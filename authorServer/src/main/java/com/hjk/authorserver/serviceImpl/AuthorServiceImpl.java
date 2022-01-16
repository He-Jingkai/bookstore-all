package com.hjk.authorserver.serviceImpl;

import com.hjk.authorserver.dao.BookDao;
import com.hjk.authorserver.entity.Book;
import com.hjk.authorserver.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private BookDao bookDao;

    @Override
    public String findAuthorByTitle(String title){
        List<Book> books=bookDao.findBooksByTitle(title);
        if(books.size()==0)
            return "NOTFOUND";
        return books.get(0).getAuthor();
    }

}
