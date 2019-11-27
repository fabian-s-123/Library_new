package at.library.controller;

import at.library.entity.SAdmin;
import at.library.entity.SCustomer;
import at.library.repository.AdminRepository;
import at.library.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorizationController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AdminRepository adminRepository;

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

    public SAdmin handleLoginAdmin(SAdmin admin){
        SAdmin currentAdmin = adminRepository.findById(admin.getId()).get();
        if (currentAdmin.getPinCode().equals(admin.getPinCode())) {
            System.out.println("Log in successful");
            return currentAdmin;
        } else {
            System.out.println("Log in failed");
            return null;
        }
    }
}
