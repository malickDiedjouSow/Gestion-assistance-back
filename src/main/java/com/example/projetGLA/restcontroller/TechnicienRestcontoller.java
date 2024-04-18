package com.example.projetGLA.restcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.projetGLA.modele.Technicien;
import com.example.projetGLA.service.TechnicienService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/GA/techniciens")

public class TechnicienRestcontoller {

    @Autowired

    private TechnicienService technicienService;

    @GetMapping(path = "/")
    public List<Technicien> lister_technicien(){
        return technicienService.lister_Technicien();
    
    }
    
    @GetMapping(path = "/{id}")
    public Technicien rechercher_technicien(@PathVariable Long id){
        return technicienService.rechercher_Technicien(id);
    }


    @PostMapping(path="/")
    public Technicien ajouter_technicien(@RequestBody Technicien technicien){
        return  technicienService.ajouter_Technicien(technicien);
    }

    @PutMapping(path = "/{id}")
    public Technicien modifier_technicien (@RequestBody Technicien technicien , @PathVariable Long id){
        return  technicienService.modifier_Technicien(technicien, id);

    }

    @DeleteMapping(path = "/{id}")
    public void supprimer_technicien(@PathVariable Long id){
        technicienService.supprimer_Technicien(id);
    }

    
}
