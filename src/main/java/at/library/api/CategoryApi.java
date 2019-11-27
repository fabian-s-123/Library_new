package at.library.api;

import at.library.controller.CategoryController;
import at.library.entity.SCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/api/categories")
public class CategoryApi {

    @Autowired
    private CategoryController categoryController;

    @PostMapping
    public ResponseEntity createCategory(@RequestBody SCategory category){
        boolean success = this.categoryController.createCategory(category);
        if (success) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity (HttpStatus.FORBIDDEN);
    }

    @GetMapping
    public Iterable<SCategory> findAll(){
        return this.categoryController.findAll();
    }

    @GetMapping(path="/{id}")
    public Optional<SCategory> getCategory(@PathVariable  int id){
        return this.categoryController.getCategory(id);
    }

    @DeleteMapping
    public void deleteCategory(SCategory category){
        this.categoryController.deleteCategory(category);
    }
}
