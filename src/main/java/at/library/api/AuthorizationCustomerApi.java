package at.library.api;

import at.library.controller.AuthorizationCustomerController;
import at.library.entity.SCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path="/api/login/customer")
public class AuthorizationCustomerApi {

    @Autowired
    private AuthorizationCustomerController authorizationCustomerController;

    @PostMapping
    public ResponseEntity login(@RequestBody SCustomer customer){
        SCustomer scustomer = this.authorizationCustomerController.handleLoginCustomer(customer);
        if (scustomer != null){
            return new ResponseEntity<>(scustomer, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }
}
