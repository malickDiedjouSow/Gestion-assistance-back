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

import com.example.projetGLA.modele.InterventionEffectuee;
import com.example.projetGLA.service.InterventionEffectueeService;


@RestController
@RequestMapping("/GA/interventionEffectuees")

public class InterventionEffectueeRestcontoller {

    @Autowired

    private InterventionEffectueeService interventionEffectueeService;

    @GetMapping(path = "/")
    public List<InterventionEffectuee> lister_interventionEffectuee(){
        return interventionEffectueeService.lister_InterventionEffectuee();
    
    }
    
    @GetMapping(path = "/{id}")
    public InterventionEffectuee rechercher_interventionEffectuee(@PathVariable Long id){
        return interventionEffectueeService.rechercher_InterventionEffectuee(id);
    }


    @PostMapping(path="/")
    public InterventionEffectuee ajouter_interventionEffectuee(@RequestBody InterventionEffectuee interventionEffectuee){
        return  interventionEffectueeService.ajouter_InterventionEffectuee(interventionEffectuee);
    }

    @PutMapping(path = "/{id}")
    public InterventionEffectuee modifier_interventionEffectuee (@RequestBody InterventionEffectuee interventionEffectuee , @PathVariable Long id){
        return  interventionEffectueeService.modifier_InterventionEffectuee(interventionEffectuee, id);

    }

    @DeleteMapping(path = "/{id}")
    public void supprimer_interventionEffectuee(@PathVariable Long id){
        interventionEffectueeService.supprimer_InterventionEffectuee(id);
    }

    
}
