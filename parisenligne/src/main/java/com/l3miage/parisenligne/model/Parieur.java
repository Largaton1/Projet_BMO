package com.l3miage.parisenligne.model;

import java.math.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
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
