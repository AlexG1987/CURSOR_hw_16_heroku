package com.cursor.hw_16_heroku.service;

import com.cursor.hw_16_heroku.model.Author;
import com.cursor.hw_16_heroku.model.Book;

import java.util.List;

public interface LibraryService {

    void addAuthor(Author author);

    void deleteAuthor(long authorId);

    void addBook(Book book);

    void deleteBook(long id);

    List<Book> getBooksByGenre(String genre);

    List<Book> getBooksByAuthor(long authorId);

    void updateBook(long oldBookId, Book book);

    void updateAuthor(long oldAuthorId, Author author);
}
