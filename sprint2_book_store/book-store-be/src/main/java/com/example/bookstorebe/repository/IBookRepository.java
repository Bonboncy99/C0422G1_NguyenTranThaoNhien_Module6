package com.example.bookstorebe.repository;

import com.example.bookstorebe.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long> {
}
