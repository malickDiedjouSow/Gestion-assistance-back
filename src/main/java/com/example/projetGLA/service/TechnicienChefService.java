package com.example.projetGLA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetGLA.modele.TechnicienChef;
import com.example.projetGLA.repository.TechnicienChefRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class TechnicienChefService {
    

    @Autowired
    private TechnicienChefRepository technicienChefRepository;


   
   public List<TechnicienChef> lister_TechnicienChef(){
      return technicienChefRepository.findAll();
   }
    

   public TechnicienChef rechercher_TechnicienChef(Long id){
      return technicienChefRepository.findById(id).get();
   }

   public TechnicienChef ajouter_TechnicienChef(TechnicienChef technicienChef){
      return technicienChefRepository.save(technicienChef);
   }

   public TechnicienChef modifier_TechnicienChef(TechnicienChef technicienChef, Long id){
      technicienChef.setId(id);
      return technicienChefRepository.save(technicienChef);
   }


   public void supprimer_TechnicienChef(Long id){
    technicienChefRepository.deleteById(id);
   }


    
}
