package com.hjk.authorserver.repository;

import com.hjk.authorserver.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findBooksByTitle(String author);
}
