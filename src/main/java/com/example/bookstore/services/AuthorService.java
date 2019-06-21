package com.example.bookstore.services;

import com.example.bookstore.models.Author;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AuthorService {

    List<Author> findAll(Pageable pageable);

    void save(Author author);
}
