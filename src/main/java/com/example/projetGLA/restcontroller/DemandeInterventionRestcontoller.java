package com.example.projetGLA.restcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.projetGLA.modele.DemandeIntervention;
import com.example.projetGLA.service.DemandeInterventionService;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/GA/demandeInterventions")

public class DemandeInterventionRestcontoller {

    @Autowired

    private DemandeInterventionService demandeInterventionService;

    @GetMapping(path = "/")
    public List<DemandeIntervention> lister_demandeIntervention(){
        return demandeInterventionService.lister_DemandeIntervention();
    
    }
    
    @GetMapping(path = "/{id}")
    public DemandeIntervention rechercher_demandeIntervention(@PathVariable Long id){
        return demandeInterventionService.rechercher_DemandeIntervention(id);
    }


    @PostMapping(path="/")
    public DemandeIntervention ajouter_demandeIntervention(@RequestBody DemandeIntervention demandeIntervention){
        return  demandeInterventionService.ajouter_DemandeIntervention(demandeIntervention);
    }

    @PostMapping("/{idP}/addTechnicienToDemande/{idE}")
    public void addPrestataireToEvent(@PathVariable Long idE, @PathVariable Long idP) {
        demandeInterventionService.addTechnicienToDemande(idE,idP);
    }

    @PutMapping(path = "/{id}")
    public DemandeIntervention modifier_demandeIntervention (@RequestBody DemandeIntervention demandeIntervention , @PathVariable Long id){
        return  demandeInterventionService.modifier_DemandeIntervention(demandeIntervention, id);

    }

    @DeleteMapping(path = "/{id}")
    public void supprimer_demandeIntervention(@PathVariable Long id){
        demandeInterventionService.supprimer_DemandeIntervention(id);
    }

    
}
