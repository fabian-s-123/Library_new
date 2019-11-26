package at.library.controller;

import at.library.entity.SLoaned;
import at.library.repository.LoanedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class LoanedController {

    @Autowired
    private LoanedRepository loanedRepository;

    public void createLoaned(SLoaned loaned) {
        this.loanedRepository.save(loaned);
    }

    public Iterable<SLoaned> findAll() {
        return this.loanedRepository.findAll();
    }

    public Optional<SLoaned> getLoaned(Integer id){
        return this.loanedRepository.findById(id);
    }

    public void deleteLoaned(SLoaned loaned){
        this.loanedRepository.delete(loaned);
    }



}
