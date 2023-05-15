package com.soroush.spring.spring6webapp.Repositories;

import com.soroush.spring.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepositories extends CrudRepository <Author , Long>{
}
