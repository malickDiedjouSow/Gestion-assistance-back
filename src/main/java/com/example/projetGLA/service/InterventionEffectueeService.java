package com.example.projetGLA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetGLA.modele.InterventionEffectuee;
import com.example.projetGLA.repository.InterventionEffectueeRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class InterventionEffectueeService {
    

    @Autowired
    private InterventionEffectueeRepository interventionEffectueeRepository;


   
   public List<InterventionEffectuee> lister_InterventionEffectuee(){
      return interventionEffectueeRepository.findAll();
   }
    

   public InterventionEffectuee rechercher_InterventionEffectuee(Long id){
      return interventionEffectueeRepository.findById(id).get();
   }

   public InterventionEffectuee ajouter_InterventionEffectuee(InterventionEffectuee interventionEffectuee){
      return interventionEffectueeRepository.save(interventionEffectuee);
   }

   public InterventionEffectuee modifier_InterventionEffectuee(InterventionEffectuee interventionEffectuee, Long id){
      interventionEffectuee.setId(id);
      return interventionEffectueeRepository.save(interventionEffectuee);
   }


   public void supprimer_InterventionEffectuee(Long id){
    interventionEffectueeRepository.deleteById(id);
   }


    
}
