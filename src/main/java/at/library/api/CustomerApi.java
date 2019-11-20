package at.library.api;

import at.library.controller.CustomerController;
import at.library.entity.SCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/api/customers")
public class CustomerApi {

    @Autowired
    private CustomerController customerController;

    @PostMapping
    public void createCustomer(@RequestBody SCustomer customer) {
        this.customerController.createCustomer(customer);
    }

    @GetMapping
    public Iterable<SCustomer> findAll() {
        return this.customerController.findAll();
    }

    @GetMapping("/{id}")
    public Optional<SCustomer> getBook(@PathVariable int id) {
        return this.customerController.getCustomer(id);
    }
}
