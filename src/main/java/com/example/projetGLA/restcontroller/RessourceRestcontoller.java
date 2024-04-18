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

import com.example.projetGLA.modele.Ressource;
import com.example.projetGLA.service.RessourceService;


@RestController
@RequestMapping("/GA/ressources")

public class RessourceRestcontoller {

    @Autowired

    private RessourceService ressourceService;

    @GetMapping(path = "/")
    public List<Ressource> lister_ressource(){
        return ressourceService.lister_Ressource();
    
    }
    
    @GetMapping(path = "/{id}")
    public Ressource rechercher_ressource(@PathVariable Long id){
        return ressourceService.rechercher_Ressource(id);
    }


    @PostMapping(path="/")
    public Ressource ajouter_ressource(@RequestBody Ressource ressource){
        return  ressourceService.ajouter_Ressource(ressource);
    }

    @PutMapping(path = "/{id}")
    public Ressource modifier_ressource (@RequestBody Ressource ressource , @PathVariable Long id){
        return  ressourceService.modifier_Ressource(ressource, id);

    }

    @DeleteMapping(path = "/{id}")
    public void supprimer_ressource(@PathVariable Long id){
        ressourceService.supprimer_Ressource(id);
    }

    
}
