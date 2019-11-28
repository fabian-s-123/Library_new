package at.library.api;

import at.library.controller.AuthorizationAdminController;
import at.library.entity.SAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path="/api/login/admin")
public class AuthorizationAdminApi {

    @Autowired
    private AuthorizationAdminController authorizationAdminController;

    @PostMapping
    public ResponseEntity login(@RequestBody SAdmin admin){
        SAdmin sadmin = this.authorizationAdminController.handleLoginAdmin(admin);
        if (sadmin != null){
            return new ResponseEntity<>(sadmin, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }
}
