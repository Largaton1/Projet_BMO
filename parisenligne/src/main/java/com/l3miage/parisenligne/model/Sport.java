package com.l3miage.parisenligne.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idSport;

    @Column
    private String NomSport;
    // Getters and setters

    // @OneToMany(mappedBy = "Sport")
    // private List<Sport> regles;
}
