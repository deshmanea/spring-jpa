package com.honeycomb.springjpa.repositories;

import com.honeycomb.springjpa.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
