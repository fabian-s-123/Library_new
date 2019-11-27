package at.library.api;

import at.library.controller.AuthorizationController;
import at.library.entity.SAdmin;
import at.library.entity.SCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path="/api/login")
public class AuthorizationApi {

    @Autowired
    private AuthorizationController authorizationController;

    @PostMapping(path="/customer")
    public ResponseEntity login(@RequestBody SCustomer customer){
        SCustomer scustomer = this.authorizationController.handleLoginCustomer(customer);
        if (scustomer != null){
            return new ResponseEntity<>(scustomer, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }

    /**
    @PostMapping(path="/admin")
    public ResponseEntity login(@RequestBody SAdmin admin){
        SAdmin sadmin = this.authorizationController.handleLoginAdmin(admin);
        if (sadmin != null){
            return new ResponseEntity<>(sadmin, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }
    */
}
