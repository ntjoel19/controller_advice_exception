package com.namek.bookapp.exception;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(Integer bookId) {
        super ("Book not found with ID : "+ bookId);
    }
}
