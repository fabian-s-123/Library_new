package at.library.repository;

import at.library.entity.SBook;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <SBook, Integer> {
}
