package com.example.projetGLA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetGLA.modele.Ressource;
import com.example.projetGLA.repository.RessourceRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class RessourceService {
    

    @Autowired
    private RessourceRepository ressourceRepository;


   
   public List<Ressource> lister_Ressource(){
      return ressourceRepository.findAll();
   }
    

   public Ressource rechercher_Ressource(Long id){
      return ressourceRepository.findById(id).get();
   }

   public Ressource ajouter_Ressource(Ressource ressource){
      return ressourceRepository.save(ressource);
   }

   public Ressource modifier_Ressource(Ressource ressource, Long id){
      ressource.setId(id);
      return ressourceRepository.save(ressource);
   }


   public void supprimer_Ressource(Long id){
    ressourceRepository.deleteById(id);
   }


    
}
