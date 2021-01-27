package com.honeycomb.springjpa.repositories;

import com.honeycomb.springjpa.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
