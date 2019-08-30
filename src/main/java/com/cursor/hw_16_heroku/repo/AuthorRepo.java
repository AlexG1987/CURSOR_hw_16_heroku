package com.cursor.hw_16_heroku.repo;

import com.cursor.hw_16_heroku.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
