package com.l3miage.parisenligne.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data

public class TypePari {
	
	 @Id
	    @Hidden
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   
	    private int idType;

	    @Column(length = 70)
	   String description;

}
