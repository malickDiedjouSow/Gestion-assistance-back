package com.example.projetGLA;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.projetGLA.modele.AdminSystem;
import com.example.projetGLA.modele.Ressource;
import com.example.projetGLA.modele.User;
import com.example.projetGLA.service.AdminSystemService;
import com.example.projetGLA.service.RessourceService;

@SpringBootApplication
public class ProjetGlaApplication implements CommandLineRunner {

	@Autowired
	private RessourceService ressourceService;
	@Autowired
	private AdminSystemService adminSystemService;

	public static void main(String[] args) {
		SpringApplication.run(ProjetGlaApplication.class, args);
	}

	@Override
	
	public void run(String... args) throws Exception {
		//Ressource Ressource1=ressourceService.ajouter_Ressource(new Ressource(null, "appareil", "electronique", new Date(0), null));

		

	}


}
