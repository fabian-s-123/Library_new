package at.library.api;

import at.library.controller.CategoryController;
import at.library.entity.SCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/api/categories")
public class ApiCategory {

    @Autowired
    private CategoryController categoryController;

    @PostMapping
    public void createCategory(@RequestBody SCategory category){
        this.categoryController.createCategory(category);
    }

    @GetMapping
    public Iterable<SCategory> findAll(){
        return this.categoryController.findAll();
    }

    @GetMapping("/{id}")
    public Optional<SCategory> getCategory(@PathVariable int id){
        return this.categoryController.getCategory(id);
    }
}
