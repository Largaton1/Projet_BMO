package com.l3miage.parisenligne.model;

import javax.persistence.*;

@Entity
public class Regles {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_regle")
    private int idRegle;
    
    // Other attributes
    
    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;
    
    // Getters and setters
}
