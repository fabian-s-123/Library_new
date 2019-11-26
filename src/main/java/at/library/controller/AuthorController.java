package at.library.controller;

import at.library.entity.SAuthor;
import at.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    public void createAuthor(SAuthor author){
        this.authorRepository.save(author);
    }

    public Iterable<SAuthor> findAll(){
        return this.authorRepository.findAll();
    }

    public Optional<SAuthor> getAuthor(int id){
        return this.authorRepository.findById(id);
    }

    public void deleteAuthor(SAuthor author){
        this.authorRepository.deleteById(author.getId());
    }
}
