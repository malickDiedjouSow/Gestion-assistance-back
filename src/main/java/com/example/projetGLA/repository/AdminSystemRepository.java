package com.example.projetGLA.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.projetGLA.modele.AdminSystem;

@Repository
public interface AdminSystemRepository extends JpaRepository <AdminSystem , Long>{


} 