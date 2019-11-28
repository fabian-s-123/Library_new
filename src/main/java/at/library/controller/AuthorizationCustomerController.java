package at.library.controller;

import at.library.entity.SCustomer;
import at.library.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorizationCustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    public SCustomer handleLoginCustomer(SCustomer customer){
        SCustomer currentCustomer = customerRepository.findById(customer.getId()).get();
        if (currentCustomer.getPinCode().equals(customer.getPinCode())) {
            System.out.println("Log in successful");
            return currentCustomer;
        } else {
            System.out.println("Log in failed");
            return null;
        }
    }
}
