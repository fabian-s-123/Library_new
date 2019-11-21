package at.library.api;

import at.library.controller.AuthorController;
import at.library.controller.BookController;
import at.library.entity.SBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/api/books")
public class BookApi {

    @Autowired
    private BookController bookController;
    @Autowired
    private AuthorController authorController;

    @PostMapping
    public void createBook(@RequestBody SBook book) {
        this.bookController.createBook(book);
    }

    @GetMapping
    public Iterable<SBook> findAll() {
        return this.bookController.findAll();
    }

    @GetMapping("/{id}")
    public Optional<SBook> getBook(@PathVariable int id) {
        return this.bookController.getBook(id);
    }

    @PutMapping("/{id}")
    public void updateBook(@RequestBody SBook book, @PathVariable int id){
        this.bookController.updateBook(book, id);
    }
}
