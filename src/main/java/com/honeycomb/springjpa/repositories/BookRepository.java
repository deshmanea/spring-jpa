package com.honeycomb.springjpa.repositories;

import com.honeycomb.springjpa.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>{

}
