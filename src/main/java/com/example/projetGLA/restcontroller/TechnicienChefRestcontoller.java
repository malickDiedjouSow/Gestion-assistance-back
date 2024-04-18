package com.example.projetGLA.restcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.projetGLA.modele.TechnicienChef;
import com.example.projetGLA.service.TechnicienChefService;


@RestController
@CrossOrigin("*")
@RequestMapping("/GA/technicienChefs")

public class TechnicienChefRestcontoller {

    @Autowired

    private TechnicienChefService technicienChefService;

    @GetMapping(path = "/")
    public List<TechnicienChef> lister_technicienChef(){
        return technicienChefService.lister_TechnicienChef();
    
    }
    
    @GetMapping(path = "/{id}")
    public TechnicienChef rechercher_technicienChef(@PathVariable Long id){
        return technicienChefService.rechercher_TechnicienChef(id);
    }


    @PostMapping(path="/")
    public TechnicienChef ajouter_technicienChef(@RequestBody TechnicienChef technicienChef){
        return  technicienChefService.ajouter_TechnicienChef(technicienChef);
    }

    @PutMapping(path = "/{id}")
    public TechnicienChef modifier_technicienChef (@RequestBody TechnicienChef technicienChef , @PathVariable Long id){
        return  technicienChefService.modifier_TechnicienChef(technicienChef, id);

    }

    @DeleteMapping(path = "/{id}")
    public void supprimer_technicienChef(@PathVariable Long id){
        technicienChefService.supprimer_TechnicienChef(id);
    }

    
}
