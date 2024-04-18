package com.example.projetGLA.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.projetGLA.modele.InterventionEffectuee;

@Repository
public interface InterventionEffectueeRepository extends JpaRepository <InterventionEffectuee , Long>{

} 

 
