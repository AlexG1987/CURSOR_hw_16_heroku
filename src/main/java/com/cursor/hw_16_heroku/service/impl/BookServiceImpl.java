package com.cursor.hw_16_heroku.service.impl;

import com.cursor.hw_16_heroku.model.Book;
import com.cursor.hw_16_heroku.repo.BookRepo;
import com.cursor.hw_16_heroku.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    @Autowired
    private final BookRepo bookRepository;

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        return bookRepository.findByGenre(genre);
    }

    @Override
    public List<Book> getBooksByAuthor(long authorId) {
        return bookRepository.findByAuthor(authorId);
    }

    @Override
    public void updateBook(long oldBookId, Book book) {
        if (bookRepository.existsById(oldBookId)) {
            bookRepository.deleteById(oldBookId);
            bookRepository.save(book);
        } else {
            bookRepository.save(book);
        }
    }

}
