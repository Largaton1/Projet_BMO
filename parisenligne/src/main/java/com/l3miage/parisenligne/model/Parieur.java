package com.l3miage.parisenligne.model;

import java.util.*;

import javax.persistence.*;

import lombok.*;
@Entity @Getter @Setter
public class Parieur {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_parieur")
    private int idParieur;
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "prenom")
    private String prenom;
    
    @Column(name = "pseudo")
    private String pseudo;
    
    @Column(name = "jetons")
    private int jetons;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    // Getters and setters
    
    @OneToMany(mappedBy = "parieur")
    private List<Paris> paris;
}


