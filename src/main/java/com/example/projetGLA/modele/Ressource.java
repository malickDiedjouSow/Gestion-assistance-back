package com.example.projetGLA.modele;

import java.util.Date;

//import java.util.List;
import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Ressource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom;
    private String type;
    private Date date;
    @ManyToOne
    private AdminSystem adminSystem;

    //@OneToMany(fetch = FetchType.LAZY,mappedBy = "ue")
    //private List<Ec> ecs;
    
}                       
