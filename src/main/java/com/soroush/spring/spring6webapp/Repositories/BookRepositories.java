package com.soroush.spring.spring6webapp.Repositories;

import com.soroush.spring.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositories extends CrudRepository<Book , Long> {
}
