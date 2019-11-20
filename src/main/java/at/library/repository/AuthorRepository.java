package at.library.repository;

import at.library.entity.SAuthor;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<SAuthor, Integer> {
}
