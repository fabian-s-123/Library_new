package at.library.api;

import at.library.controller.AuthorController;
import at.library.entity.SAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/api/authors")
public class AuthorApi {

    @Autowired
    private AuthorController authorController;

    @PostMapping
    public void createAuthor(@RequestBody SAuthor author){
        this.authorController.createAuthor(author);
    }

    @GetMapping
    public Iterable<SAuthor> findAll(){
        return this.authorController.findAll();
    }

    @GetMapping("/{id}")
    public Optional<SAuthor> getAuthor(@PathVariable int id){
        return this.authorController.getAuthor(id);
    }
}
