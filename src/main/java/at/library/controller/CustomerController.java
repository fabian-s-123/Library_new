package at.library.controller;

import at.library.entity.SCustomer;
import at.library.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    public boolean createCustomer(SCustomer customer){
        if ((!(customer.getPinCode()==null)) &&
                (!(customer.getEmail()==null)) &&
                (!(customer.getFirstName()==null)) &&
                (!(customer.getLastName()==null)) &&
                (!(customer.getBirthDay()==null)) &&
                (!(customer.getStreet()==null)) &&
                (!(customer.getApNr()==null)) &&
                (customer.getZip()>0) &&
                (!(customer.getCity()==null)) &&
                (customer.getCreditCardNr()>0) &&
                (customer.getCvc()>0) &&
                (customer.getExpiryDateYear()>0) &&
                (customer.getExpiryDateMonth()>0)){
            this.customerRepository.save(customer);
            System.out.println("Customer successfully created");
            return true;
        }
        System.out.println("Customer could not be created");
        return false;
    }

    public Iterable<SCustomer> findAll(){
        return this.customerRepository.findAll();
    }

    public Optional<SCustomer> getCustomer(int id){
        return this.customerRepository.findById(id);
    }

    public void deleteCustomer(SCustomer customer){
        this.customerRepository.deleteById(customer.getId());
    }
}
