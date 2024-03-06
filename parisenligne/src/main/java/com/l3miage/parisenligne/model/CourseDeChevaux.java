package com.l3miage.parisenligne.model;

import javax.persistence.*;

@Entity
public class CourseDeChevaux {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_course")
    private int idCourse;
    
    @OneToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;
    
    // Other attributes and methods
}
