package com.cursor.hw_16_heroku.controller;

import com.cursor.hw_16_heroku.model.Author;
import com.cursor.hw_16_heroku.service.AuthorService;
import com.cursor.hw_16_heroku.service.impl.AuthorServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("author")
public class AuthorController {

    @Autowired
    final AuthorServiceImpl authorService;

    @PostMapping("/")
    public ResponseEntity addAuthor(@RequestBody Author author) {
        authorService.addAuthor(author);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();

    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteAuthor(@PathVariable("id") long authorId) {
        authorService.deleteAuthor(authorId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity updateAuthor(@PathVariable("id") int oldAuthorId, @RequestBody Author author) {
        authorService.updateAuthor(oldAuthorId, author);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

}
