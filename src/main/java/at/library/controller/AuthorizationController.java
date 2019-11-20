package at.library.controller;

import at.library.entity.SCustomer;
import at.library.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorizationController {

    @Autowired
    private CustomerRepository customerRepository;

    public SCustomer handleLogin(SCustomer customer){
        SCustomer currentCustomer = (SCustomer)this.customerRepository.findById(customer.getId()).get();
        if (currentCustomer.getPinCode().equals(customer.getPinCode())) {
            System.out.println("LOG IN SUCCESSFUL");
            return currentCustomer;
        } else {
            System.out.println("LOG IN FAILED");
            return null;
        }
    }
}
