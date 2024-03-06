package com.l3miage.parisenligne.model;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Football extends Sport {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_football")
    private int idFootball;
    
    @OneToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;
    

}

