package com.example.projetGLA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetGLA.modele.AdminSystem;
import com.example.projetGLA.repository.AdminSystemRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class AdminSystemService {
    

    @Autowired
    private AdminSystemRepository adminSystemRepository;


   
   public List<AdminSystem> lister_AdminSystem(){
      return adminSystemRepository.findAll();
   }
    

   public AdminSystem rechercher_AdminSystem(Long id){
      return adminSystemRepository.findById(id).get();
   }

   public AdminSystem ajouter_AdminSystem(AdminSystem adminSystem){
      return adminSystemRepository.save(adminSystem);
   }

   public AdminSystem modifier_AdminSystem(AdminSystem adminSystem, Long id){
      adminSystem.setId(id);
      return adminSystemRepository.save(adminSystem);
   }


   public void supprimer_AdminSystem(Long id){
    adminSystemRepository.deleteById(id);
   }


    
}
