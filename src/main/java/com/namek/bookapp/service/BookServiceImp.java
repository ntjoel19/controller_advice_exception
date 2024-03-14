package com.namek.bookapp.service;

import com.namek.bookapp.entity.Book;
import com.namek.bookapp.exception.BadRequestException;
import com.namek.bookapp.exception.BookNotFoundException;
import com.namek.bookapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImp implements BookService{

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        try {
            return bookRepository.save(book);
        } catch (Exception exception) {
            throw new BadRequestException(exception.getMessage());
        }
    }

    public Optional<Book> getBookById(final Integer id) {
        return Optional.ofNullable(bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id)));
    }

    public Iterable<Book> getBook() {
        try {
            return bookRepository.findAll();
        } catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    public  void deleteBook(final Integer id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));

        bookRepository.deleteById(book.getId());
    }
}
