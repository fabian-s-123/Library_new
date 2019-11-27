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

    public boolean createAuthor(SAuthor author){
        if ((!(author.getFirstName()==null)) &&
                (!(author.getLastName()==null)) &&
                (author.getBirthYear()>0)){
            this.authorRepository.save(author);
            System.out.println("Author successfully created");
            return true;
        }
        System.out.println("Author could not be created");
        return false;
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
