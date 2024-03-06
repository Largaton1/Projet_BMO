package com.l3miage.parisenligne.model;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Sport  {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_sport")
    private int idSport;
    
    // Getters and setters
    
    @OneToMany(mappedBy = "Sport")
    private List<Regles> regles;
}
