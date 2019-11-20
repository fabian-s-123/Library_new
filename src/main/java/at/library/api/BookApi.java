package at.library.api;

import at.library.controller.BookController;
import at.library.entity.SBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/api/books")
public class BookApi {
    @Autowired
    private BookController bookController;

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
}
