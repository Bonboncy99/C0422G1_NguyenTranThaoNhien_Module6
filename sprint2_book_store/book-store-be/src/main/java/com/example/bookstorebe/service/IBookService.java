package com.example.bookstorebe.service;

import com.example.bookstorebe.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService {
    Page<Book> findAll(Pageable pageable);
    Book findById(Long id);

}
