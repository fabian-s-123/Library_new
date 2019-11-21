package at.library.controller;

import at.library.entity.SBook;
import at.library.entity.SCategory;
import at.library.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    public void createCategory(SCategory category){
        this.categoryRepository.save(category);
    }

    public Iterable<SCategory> findAll(){
        return this.categoryRepository.findAll();
    }

    public Optional<SCategory> getCategory(int id){
        return this.categoryRepository.findById(id);
    }
}
