package at.library.controller;

import at.library.entity.SCategory;
import at.library.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    public boolean createCategory(SCategory category){
        if ((!(category.getDescription()==null))) {
            this.categoryRepository.save(category);
            System.out.println("Category successfully created");
            return true;
        }
        System.out.println("Category could not be created");
        return false;
    }

    public Iterable<SCategory> findAll(){
        return this.categoryRepository.findAll();
    }

    public Optional<SCategory> getCategory(int id){
        return this.categoryRepository.findById(id);
    }

    public void deleteCategory(SCategory category){
        this.categoryRepository.deleteById(category.getId());
    }
}
