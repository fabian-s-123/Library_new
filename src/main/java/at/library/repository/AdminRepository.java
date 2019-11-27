package at.library.repository;

import at.library.entity.SAdmin;
import org.springframework.data.repository.CrudRepository;


public interface AdminRepository extends CrudRepository<SAdmin, Integer> {
}
