package at.library.api;

import at.library.controller.AuthorizationController;
import at.library.entity.SCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path="/api/login/customer")
public class AuthorizationApi {

    @Autowired
    private AuthorizationController authorizationController;

    @PostMapping(path)
    public ResponseEntity login(@RequestBody SCustomer customer){
        SCustomer sCustomer = this.authorizationController.handleLogin(customer);
        if (sCustomer != null){
            return new ResponseEntity<>(sCustomer, HttpStatus.OK);
        }
        // if customer have more than 3 tries
        // return timeout
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }


}
