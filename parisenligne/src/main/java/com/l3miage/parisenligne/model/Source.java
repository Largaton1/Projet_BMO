// package com.l3miage.parisenligne.model;

// import java.util.*;

// import javax.persistence.*;

// import lombok.*;

// @Entity @Getter @Setter
// public class Source {
//     @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
//     @Column(name = "id_source")
//     private int idSource;
    
//     // Other attributes
    
//     @OneToMany(mappedBy = "source")
//     private List<Evenement> evenements;
    
//     // Getters and setters
// }
