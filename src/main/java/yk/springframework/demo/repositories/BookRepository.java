package yk.springframework.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import yk.springframework.demo.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
