package com.odhiambopaul.springamazon.repositories;

import com.odhiambopaul.springamazon.domain.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    Todo findByTitle(String title);
}
