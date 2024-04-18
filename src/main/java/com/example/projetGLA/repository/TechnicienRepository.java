package com.example.projetGLA.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.projetGLA.modele.Technicien;

@Repository
public interface TechnicienRepository extends JpaRepository <Technicien , Long>{

} 

 
