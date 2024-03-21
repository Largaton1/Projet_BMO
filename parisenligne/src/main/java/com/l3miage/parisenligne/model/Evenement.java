package com.l3miage.parisenligne.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Table(name = "evenement") // Assuming the table name in the database is "evenement"
@Data
public class Evenement {
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "date_evenement")
    private LocalDate dateEvenement; 

    @Column(name = "domicile")
    private String homeTeam;

    @Column(name = "exterieur")
    private String awayTeam;
}
