package com.cursor.hw_16_heroku.service.impl;

import com.cursor.hw_16_heroku.model.Author;
import com.cursor.hw_16_heroku.repo.AuthorRepo;
import com.cursor.hw_16_heroku.repo.BookRepo;
import com.cursor.hw_16_heroku.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    @Override
    public void addAuthor(Author author) {
        authorRepo.save(author);
    }

    @Override
    public void deleteAuthor(long authorId) {
        authorRepo.deleteById(authorId);
    }


    @Override
    public void updateAuthor(long oldAuthorId, Author author) {
        if (bookRepo.existsById(oldAuthorId)) {
            authorRepo.deleteById(oldAuthorId);
            authorRepo.save(author);
        } else {
            authorRepo.deleteById(oldAuthorId);
            authorRepo.save(author);
        }
    }

}
