package com.l3miage.parisenligne.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data
@Getter
@Setter
public class Pari {
	@Id
	@Hidden
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	Long idPari;

	//  @ManyToOne(fetch= FetchType.LAZY)
	//  @DescriptionsList
   //  Evenement evenement;
	  
	  
	  @ManyToOne(fetch= FetchType.LAZY)
	  @DescriptionsList
     TypePari typePari;
	  
	   @ManyToOne(fetch= FetchType.LAZY)
	   @DescriptionsList
    Sport sport;

	@Column(name = "montant")
	private float montant;

	
}
