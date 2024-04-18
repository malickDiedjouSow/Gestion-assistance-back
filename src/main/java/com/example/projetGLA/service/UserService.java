package com.example.projetGLA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetGLA.modele.User;
import com.example.projetGLA.repository.UserRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class UserService {
    

    @Autowired
    private UserRepository userRepository;


   
   public List<User> lister_User(){
      return userRepository.findAll();
   }
    

   public User rechercher_User(Long id){
      return userRepository.findById(id).get();
   }

   public User ajouter_User(User user){
      return userRepository.save(user);
   }

   public User modifier_User(User user, Long id){
      user.setId(id);
      return userRepository.save(user);
   }


   public void supprimer_User(Long id){
    userRepository.deleteById(id);
   }


    
}
