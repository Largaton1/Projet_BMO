package com.l3miage.parisenligne.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Parieur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String Nom;

    @Column
    private String Prenom;

    @Column(unique = true)
    private String email;

    @Column
    private BigDecimal solde;

    public void login(String email, String password) {

    }

    public void consulterPari() {

    }

    public void consulterEvent() {

    }

    public void placerPari() {

    }

    public void rechargerJetons() {

    }
}
