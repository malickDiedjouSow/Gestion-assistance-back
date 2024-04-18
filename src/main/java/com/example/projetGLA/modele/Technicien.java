package com.example.projetGLA.modele;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Technicien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String prenom;
    private String nom;
    private String email;
    private String mot_de_passe;
    private Date date;

    @ManyToOne
    private DemandeIntervention demandeIntervention;
}

