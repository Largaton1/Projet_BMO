// package com.l3miage.parisenligne.model;

// import javax.persistence.*;

// import lombok.*;

// @Entity @Getter @Setter
// public class Ticket {
//     @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
//     @Column(name = "id_ticket")
//     private int idTicket;
    
//     @Column(name = "cote")
//     private int cote;
    
//     @Column(name = "mise")
//     private int mise;
    
//     @Column(name = "id_pari")
//     private int idPari;
    
//     // Getters and setters
    
//     @ManyToOne
//     @JoinColumn(name = "paris_id")
//     private Paris paris;
    
// }

