package at.library.repository;

import at.library.entity.SCustomer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<SCustomer, Integer> {
}
