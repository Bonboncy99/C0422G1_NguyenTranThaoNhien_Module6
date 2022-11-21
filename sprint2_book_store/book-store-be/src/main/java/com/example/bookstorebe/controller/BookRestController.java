package com.example.bookstorebe.controller;

import com.example.bookstorebe.model.Book;
import com.example.bookstorebe.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RequestMapping("books")
@RestController
public class BookRestController {

    @Autowired
   private IBookService iBookService;

    @GetMapping("")
    public ResponseEntity<Page<Book>> findAll(@PageableDefault(size = 5)Pageable pageable){
        Page<Book>bookPage = this.iBookService.findAll(pageable);
        if (bookPage.hasContent()) {
            return new ResponseEntity<>(bookPage, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
@GetMapping("{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id){
        Book book= this.iBookService.findById(id);
        if (book == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(book,HttpStatus.OK);
    }
}
