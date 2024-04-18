package com.example.projetGLA.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.projetGLA.modele.Ressource;

@Repository
public interface RessourceRepository extends JpaRepository <Ressource , Long>{

} 

 
