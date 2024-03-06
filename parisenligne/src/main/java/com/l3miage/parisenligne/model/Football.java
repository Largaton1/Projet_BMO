package com.l3miage.parisenligne.model;

import javax.persistence.*;

@Entity
public class Football {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_football")
    private int idFootball;
    
    @OneToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;
    
    // Other attributes and methods
}

