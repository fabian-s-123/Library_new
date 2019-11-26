package at.library.api;

import at.library.controller.AuthorizationController;
import at.library.entity.SCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path="/api/login")
public class AuthorizationApi {

    @Autowired
    private AuthorizationController authorizationController;

    @PostMapping
    public SCustomer login(@RequestBody SCustomer customer){
        return this.authorizationController.handleLogin(customer);
    }
}
