package at.library.repository;

import at.library.entity.SLoaned;
import org.springframework.data.repository.CrudRepository;

public interface LoanedRepository extends CrudRepository<SLoaned, Integer> {
}
