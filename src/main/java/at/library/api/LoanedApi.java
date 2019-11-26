package at.library.api;

import at.library.controller.LoanedController;
import at.library.entity.SLoaned;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="api/loaned")
public class LoanedApi {

    @Autowired
    private LoanedController loanedController;

    @PostMapping
    public void createLoaned(@RequestBody SLoaned loaned){
        this.loanedController.createLoaned(loaned);
    }

    @GetMapping
    public Iterable<SLoaned> findAll(){
        return this.loanedController.findAll();
    }

    @GetMapping(path="/{id}")
    public Optional<SLoaned> getLoaned(@PathVariable  int id){
        return this.loanedController.getLoaned(id);
    }

    @DeleteMapping
    public void deleteLoaned(SLoaned loaned){
        this.loanedController.deleteLoaned(loaned);
    }
}
