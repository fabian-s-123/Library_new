package at.library.controller;

import at.library.entity.SBook;
import at.library.entity.SCustomer;
import at.library.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    public void createCustomer(SCustomer customer){
        this.customerRepository.save(customer);
    }

    public Iterable<SCustomer> findAll(){
        return this.customerRepository.findAll();
    }

    public Optional<SCustomer> getCustomer(int id){
        return this.customerRepository.findById(id);
    }
}
