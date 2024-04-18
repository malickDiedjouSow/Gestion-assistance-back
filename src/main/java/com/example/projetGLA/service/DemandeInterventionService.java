package com.example.projetGLA.service;

import java.util.List;

import com.example.projetGLA.modele.Technicien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetGLA.modele.DemandeIntervention;
import com.example.projetGLA.repository.DemandeInterventionRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class DemandeInterventionService {
    

    @Autowired
    private DemandeInterventionRepository demandeInterventionRepository;
   @Autowired
   private TechnicienService technicienService ;
   public DemandeIntervention getOneDemande(Long id) {
      return demandeInterventionRepository.findById(id).get();
   }


   public void addTechnicienToDemande(Long idE, Long idP) {

      DemandeIntervention event = getOneDemande(idE);
      Technicien technicien = technicienService.rechercher_Technicien(idP);
      event.getTechniciens().add(technicien);
      demandeInterventionRepository.save(event);
   }

   
   public List<DemandeIntervention> lister_DemandeIntervention(){
      return demandeInterventionRepository.findAll();
   }


   public DemandeIntervention rechercher_DemandeIntervention(Long id){
      return demandeInterventionRepository.findById(id).get();
   }

   public DemandeIntervention ajouter_DemandeIntervention(DemandeIntervention demandeIntervention){
      return demandeInterventionRepository.save(demandeIntervention);
   }

   public DemandeIntervention modifier_DemandeIntervention(DemandeIntervention demandeIntervention, Long id){
      demandeIntervention.setId(id);
      return demandeInterventionRepository.save(demandeIntervention);
   }


   public void supprimer_DemandeIntervention(Long id){
    demandeInterventionRepository.deleteById(id);
   }


    
}
