package com.l3miage.parisenligne.model;
import java.util.*;

import javax.persistence.*;
@Entity
public class Evenement {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
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
    
    @OneToMany(mappedBy = "evenement")
    private List<Paris> paris;
    
    @ManyToOne
    @JoinColumn(name = "bookmarker_id")
    private Bookmarker bookmarker;

    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;
    
    @ManyToOne
    @JoinColumn(name = "source_id")
    private Source source;
    
}
    

