package com.example.projetGLA.modele;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class TechnicienChef{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String prenom;
    private String nom;
    private String email;
    private String mot_de_passe;
    private Date date;
    @JsonIgnore
    @OneToMany(mappedBy = "technicienChef")
    private List<InterventionEffectuee> interventionEffectuees;
   
}                       
