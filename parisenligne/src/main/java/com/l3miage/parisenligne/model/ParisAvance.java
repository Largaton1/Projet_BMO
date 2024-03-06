package com.l3miage.parisenligne.model;

import javax.persistence.*;

@Entity
public class PariAvance {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_pari_avance")
    private int idPariAvance;
    
    // Other attributes
    
    @ManyToOne
    @JoinColumn(name = "paris_id")
    private Paris paris;
    
    // Getters and setters
}
