package com.example.bookstore.services;


import com.example.bookstore.models.Book;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    List<Book> findAll(Pageable pageable);

    Book updateBook(Book book, long id);

    void delete(long id);

    void assignAuthor(long bookid, long authorid);

    void save(Book book);
}