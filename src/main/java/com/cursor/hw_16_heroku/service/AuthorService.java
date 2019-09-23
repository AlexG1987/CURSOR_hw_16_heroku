package com.cursor.hw_16_heroku.service;

import com.cursor.hw_16_heroku.model.Author;

public interface AuthorService {

    void addAuthor(Author author);

    void deleteAuthor(long authorId);

    void updateAuthor(long oldAuthorId, Author author);

}
