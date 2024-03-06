package com.l3miage.parisenligne.model;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class CourseDeChevaux extends Sport {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_course")
    private int idCourse;
	@OneToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;
	
	//Getters et Setters



    
}
