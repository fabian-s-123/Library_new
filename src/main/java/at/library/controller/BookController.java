package at.library.controller;

import at.library.entity.SBook;
import at.library.repository.BookRepository;
import org.springframework.beans.BeanUtils;
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

    public void updateBook (SBook book, int id){
        SBook currentBook = this.bookRepository.findById(id).get();
       /* if(!(book.getTitle().length()==0)) currentBook.setTitle(book.getTitle());
        if(book.getAuthorId()) currentBook.setAuthorId(book.getAuthorId());
        if(book.getCategoryId()==0) currentBook.setCategoryId(book.getCategoryId());
        if(book.getFsk()==0) currentBook.setFsk(book.getFsk());
        if(book.getIsbn()==0) currentBook.setIsbn(book.getIsbn());
        if(!book.getPublisher().isEmpty()) currentBook.setPublisher(book.getPublisher());
        if(!book.getEdition().isEmpty()) currentBook.setEdition(book.getEdition());
        if(!book.getFirstEdition().isEmpty()) currentBook.setFirstEdition(book.getFirstEdition());
        if(book.getPages()==0) currentBook.setPages(book.getPages());
        if(!book.getLanguage().isEmpty()) currentBook.setLanguage(book.getLanguage());*/
        BeanUtils.copyProperties(currentBook, book);
        this.bookRepository.save(book);
        System.out.println("update successful");
    }
}
