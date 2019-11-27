package at.library.controller;

import at.library.entity.SAdmin;
import at.library.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    public boolean createAdmin(SAdmin admin){
        if ((!(admin.getName()==null)) &&
                (!(admin.getPinCode()==null))) {
            this.adminRepository.save(admin);
            System.out.println("Admin successfully created");
            return true;
        }
        System.out.println("Admin could not be created");
        return false;
    }

    public Iterable<SAdmin> findAll(){
        return this.adminRepository.findAll();
    }

    public Optional<SAdmin> getAdmin(int id){
        return this.adminRepository.findById(id);
    }

    public void deleteAdmin(SAdmin admin){
        this.adminRepository.deleteById(admin.getId());
    }
}
