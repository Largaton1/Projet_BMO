package com.l3miage.parisenligne.model;

import javax.persistence.*;

@Entity
public class Tenis {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_tenis")
    private int idTenis;
    
    @OneToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;
    
    // Other attributes and methods
}
