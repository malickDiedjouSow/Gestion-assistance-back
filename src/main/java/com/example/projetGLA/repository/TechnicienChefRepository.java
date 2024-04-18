package com.example.projetGLA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.projetGLA.modele.TechnicienChef;

@Repository
public interface TechnicienChefRepository extends JpaRepository <TechnicienChef , Long>{

} 