package at.library.api;

import at.library.controller.AdminController;
import at.library.entity.SAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/api/admins")
public class AdminApi {

    @Autowired
    private AdminController adminController;

    @PostMapping
    public ResponseEntity createAdmin(@RequestBody SAdmin admin) {
        boolean success = this.adminController.createAdmin(admin);
        if (success){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }

    @GetMapping
    public Iterable<SAdmin> findAll() {
        return this.adminController.findAll();
    }

    @GetMapping(path="/{id}")
    public Optional<SAdmin> getAdmin(int id){
        return this.adminController.getAdmin(id);
    }

    @DeleteMapping
    public void deleteAdmin(@RequestBody SAdmin admin){
        this.adminController.deleteAdmin(admin);
    }
}
