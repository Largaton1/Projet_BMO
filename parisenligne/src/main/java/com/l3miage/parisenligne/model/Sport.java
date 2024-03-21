package com.l3miage.parisenligne.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data
public class Sport {
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    private int idSport;

    @Column(length = 70)
   String description;
    // Getters and setters

   
}
