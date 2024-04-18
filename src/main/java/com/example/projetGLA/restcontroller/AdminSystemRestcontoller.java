package com.example.projetGLA.restcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetGLA.modele.AdminSystem;
import com.example.projetGLA.service.AdminSystemService;


@RestController
@RequestMapping("/GA/adminSystems")

public class AdminSystemRestcontoller {

    @Autowired

    private AdminSystemService adminSystemService;

    @GetMapping(path = "/")
    public List<AdminSystem> lister_adminSystem(){
        return adminSystemService.lister_AdminSystem();
    
    }
    
    @GetMapping(path = "/{id}")
    public AdminSystem rechercher_adminSystem(@PathVariable Long id){
        return adminSystemService.rechercher_AdminSystem(id);
    }


    @PostMapping(path="/")
    public AdminSystem ajouter_adminSystem(@RequestBody AdminSystem adminSystem){
        return  adminSystemService.ajouter_AdminSystem(adminSystem);
    }

    @PutMapping(path = "/{id}")
    public AdminSystem modifier_adminSystem (@RequestBody AdminSystem adminSystem , @PathVariable Long id){
        return  adminSystemService.modifier_AdminSystem(adminSystem, id);

    }

    @DeleteMapping(path = "/{id}")
    public void supprimer_adminSystem(@PathVariable Long id){
        adminSystemService.supprimer_AdminSystem(id);
    }

    
}
