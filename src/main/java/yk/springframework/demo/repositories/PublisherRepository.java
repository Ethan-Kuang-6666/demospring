package yk.springframework.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import yk.springframework.demo.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
