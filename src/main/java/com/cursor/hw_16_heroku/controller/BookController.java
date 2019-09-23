package com.cursor.hw_16_heroku.controller;

import com.cursor.hw_16_heroku.model.Book;
import com.cursor.hw_16_heroku.service.impl.BookServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("book")
public class BookController {

    @Autowired
    final BookServiceImpl bookService;


    @PostMapping("/")
    public ResponseEntity addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @ResponseBody
    @GetMapping("/{genre}")
    public List<Book> sortedBooksByGenre(@PathVariable("genre") String genre) {
        return bookService.getBooksByGenre(genre);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBook(@PathVariable("id") long bookId) {
        bookService.deleteBook(bookId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }


    @PatchMapping("/{id}")
    public ResponseEntity updateBook(@PathVariable("id") int oldBookId, @RequestBody Book book) {
        bookService.updateBook(oldBookId, book);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

}
