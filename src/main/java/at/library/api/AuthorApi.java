package at.library.api;

import at.library.controller.AuthorController;
import at.library.entity.SAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/api/authors")
public class AuthorApi {

    @Autowired
    private AuthorController authorController;

    @PostMapping
    public ResponseEntity createAuthor(@RequestBody SAuthor author){
        boolean success = this.authorController.createAuthor(author);
        if (success) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity (HttpStatus.FORBIDDEN);
    }

    @GetMapping
    public Iterable<SAuthor> findAll(){
        return this.authorController.findAll();
    }

    @GetMapping(path="/{id}")
    public Optional<SAuthor> getAuthor(@PathVariable  int id){
        return this.authorController.getAuthor(id);
    }

    @DeleteMapping
    public void deleteAuthor(SAuthor author){
        this.authorController.deleteAuthor(author);
    }
}
