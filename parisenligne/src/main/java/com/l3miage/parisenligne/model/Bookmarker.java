package com.l3miage.parisenligne.model;

import javax.persistence.*;

@Entity
public class Bookmarker {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "nom")
    private String nom;
    
    // Getters and setters
}
