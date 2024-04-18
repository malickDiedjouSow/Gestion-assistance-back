package com.example.projetGLA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetGLA.modele.Technicien;
import com.example.projetGLA.repository.TechnicienRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class TechnicienService {
    

    @Autowired
    private TechnicienRepository technicienRepository;


   
   public List<Technicien> lister_Technicien(){
      return technicienRepository.findAll();
   }
    

   public Technicien rechercher_Technicien(Long id){
      return technicienRepository.findById(id).get();
   }

   public Technicien ajouter_Technicien(Technicien technicien){
      return technicienRepository.save(technicien);
   }

   public Technicien modifier_Technicien(Technicien technicien, Long id){
      technicien.setId(id);
      return technicienRepository.save(technicien);
   }


   public void supprimer_Technicien(Long id){
    technicienRepository.deleteById(id);
   }


    
}
