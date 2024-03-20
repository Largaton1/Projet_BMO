package com.l3miage.parisenligne.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PariAvance extends Pari {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pari_avance")
    private int idPariAvance;

    // Other attributes

    @ManyToOne
    @JoinColumn(name = "pari_id")
    private Pari pari;

    // Getters and setters
}
