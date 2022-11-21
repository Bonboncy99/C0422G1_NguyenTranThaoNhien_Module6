package com.example.bookstorebe.service.impl;

import com.example.bookstorebe.model.Book;
import com.example.bookstorebe.repository.IBookRepository;
import com.example.bookstorebe.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;
    @Override
    public Page<Book> findAll(Pageable pageable) {
        return iBookRepository.findAll(pageable);
    }

    @Override
    public Book findById(Long id) {
        return iBookRepository.findById(id).orElse(null);
    }
}
