package com.cursor.hw_16_heroku.controller;

import com.cursor.hw_16_heroku.model.Author;
import com.cursor.hw_16_heroku.model.Book;
import com.cursor.hw_16_heroku.service.LibraryServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class LibraryController {

    @Autowired
    final LibraryServiceImpl LibraryServiceImpl;

    @PostMapping("/addAuthor")
    public ResponseEntity addAuthor(@RequestBody Author author) {
        LibraryServiceImpl.addAuthor(author);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();

    }

    @PostMapping("/addBook")
    public ResponseEntity addBook(@RequestBody Book book) {
        LibraryServiceImpl.addBook(book);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @ResponseBody
    @GetMapping("/sortedBooksByGenre/{genre}")
    public List<Book> sortedBooksByGenre(@PathVariable("genre") String genre) {
        return LibraryServiceImpl.getBooksByGenre(genre);
    }

    @DeleteMapping("/deleteAuthor/{id}")
    public ResponseEntity deleteAuthor(@PathVariable("id") long authorId) {
        LibraryServiceImpl.deleteAuthor(authorId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity deleteBook(@PathVariable("id") long bookId) {
        LibraryServiceImpl.deleteBook(bookId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PatchMapping("/updateAuthor/{id}")
    public ResponseEntity updateAuthor(@PathVariable("id") int oldAuthorId, @RequestBody Author author) {
        LibraryServiceImpl.updateAuthor(oldAuthorId, author);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PatchMapping("/updateBook/{id}")
    public ResponseEntity updateBook(@PathVariable("id") int oldBookId, @RequestBody Book book) {
        LibraryServiceImpl.updateBook(oldBookId, book);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

}
