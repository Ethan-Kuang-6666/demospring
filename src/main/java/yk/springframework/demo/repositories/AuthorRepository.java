package yk.springframework.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import yk.springframework.demo.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
