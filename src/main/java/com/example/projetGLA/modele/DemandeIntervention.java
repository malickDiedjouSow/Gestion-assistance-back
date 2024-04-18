package com.example.projetGLA.modele;

import java.util.Date;
import java.util.List;

//import java.util.List;
import jakarta.persistence.*;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class DemandeIntervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String libelle;
    private String objet;
    private Date date;

    @ManyToOne
    private User user;

    @OneToMany (mappedBy = "demandeIntervention")
    private List<Technicien> techniciens;
    //@OneToMany(fetch = FetchType.LAZY,mappedBy = "ue")
    //private List<Ec> ecs;
    
}                       
