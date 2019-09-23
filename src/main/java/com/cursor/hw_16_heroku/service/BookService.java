package com.cursor.hw_16_heroku.service;

import com.cursor.hw_16_heroku.model.Author;
import com.cursor.hw_16_heroku.model.Book;

import java.util.List;

public interface BookService {


    void addBook(Book book);

    void deleteBook(long id);

    List<Book> getBooksByGenre(String genre);

    List<Book> getBooksByAuthor(long authorId);

    void updateBook(long oldBookId, Book book);

}
