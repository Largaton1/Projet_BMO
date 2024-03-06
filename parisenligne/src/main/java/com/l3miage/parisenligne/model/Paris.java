package com.l3miage.parisenligne.model;
import java.util.*;

import javax.persistence.*;

@Entity
public class Paris {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_pari")
    private int idPari;
    
    @Column(name = "montant_min")
    private int montantMin;
    
    @Column(name = "montant_max")
    private int montantMax;
    

    // Getters and setters
    @OneToMany(mappedBy = "paris")
    private List<Ticket> tickets;
    
    @ManyToOne
    @JoinColumn(name = "parieur_id")
    private Parieur parieur;
}

