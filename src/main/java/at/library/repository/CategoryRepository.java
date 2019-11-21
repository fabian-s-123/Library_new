package at.library.repository;

import at.library.entity.SCategory;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<SCategory, Integer> {
}
