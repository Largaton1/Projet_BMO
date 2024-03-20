package com.l3miage.parisenligne.model;

import java.util.Date;

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
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evenement")
    private int idEvenement;

    @Column(name = "nom")
    private String nom;

    @Column(name = "lieu")
    private String lieu;

    @Column(name = "resultat")
    private String resultat;

    @Column(name = "date_evenement")
    private Date dateEvenement;

    @Column(name = "heure_debut")
    private Date heureDebut;

    @Column(name = "heure_fin")
    private Date heureFin;

    @Column(name = "equipes")
    private String equipes;

    // Getters and setters

    // @OneToMany(mappedBy = "evenement")
    // private List<Paris> paris;

    // @ManyToOne
    // @JoinColumn(name = "bookmarker_id")
    // private Bookmarker bookmarker;

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
