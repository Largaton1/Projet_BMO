package com.l3miage.parisenligne.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idEvenement;

    @Column(name = "Nom_evenement")
    private String nom;

    @Column(name = "Lieu")
    private String lieu;

    @Column(name = "Resultat")
    private String resultat;

    @Column(name = "Date_evenement")
    private Date dateEvenement;

    @Column(name = "Heure_debut")
    private Date heureDebut;

    @Column(name = "Heure_fin")
    private Date heureFin;

    @Column
    private String homeTeam;

    @Column
    private String awayTeam;

    // Getters and setters

    // @OneToMany(mappedBy = "evenement")
    // private List<Paris> paris;

    // @ManyToOne
    // @JoinColumn(name = "sport_id")
    // private Sport sport;

    // @ManyToOne
    // @JoinColumn(name = "source_id")
    // private Source source;

    public void ajoutEvent() {

    }

    public void maj() {
        // Implementation for updateOdds method
    }
}
