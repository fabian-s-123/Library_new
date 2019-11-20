package at.library.controller;

import at.library.entity.SBook;
import at.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    public void createBook(SBook book){
        this.bookRepository.save(book);
    }

    public Iterable<SBook> findAll(){
        return this.bookRepository.findAll();
    }

    public Optional<SBook> getBook(int id){
        return this.bookRepository.findById(id);
    }

}
