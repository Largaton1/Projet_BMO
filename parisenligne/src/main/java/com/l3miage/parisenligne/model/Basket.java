package com.l3miage.parisenligne.model;

import javax.persistence.*;

@Entity
public class Basket {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_basket")
    private int idBasket;
    
    @OneToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;
    
    // Other attributes and methods
}
