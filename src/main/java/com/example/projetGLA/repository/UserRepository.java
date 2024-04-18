package com.example.projetGLA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.projetGLA.modele.User;

@Repository
public interface UserRepository extends JpaRepository <User , Long>{
} 