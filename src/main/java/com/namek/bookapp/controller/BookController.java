package com.namek.bookapp.controller;

import com.namek.bookapp.entity.Book;
import com.namek.bookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/")
    public Book save(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/{bookId}")
    public Optional<Book> getBookById(@PathVariable Integer bookId) {
        return bookService.getBookById(bookId);
    }

    @GetMapping("/")
    public Iterable<Book> getBook(){
        return bookService.getBook();
    }

    @DeleteMapping("/{bookId}")
    public  void deleteBook(@PathVariable Integer bookId) {
        bookService.deleteBook(bookId);
    }
}
