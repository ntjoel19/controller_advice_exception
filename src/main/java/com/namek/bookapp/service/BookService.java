package com.namek.bookapp.service;

import com.namek.bookapp.entity.Book;

import java.util.Optional;

public interface BookService {
    public Book saveBook(Book book);
    public Optional<Book> getBookById(final Integer id);
    public Iterable<Book> getBook();
    public  void deleteBook(final Integer id);
}
