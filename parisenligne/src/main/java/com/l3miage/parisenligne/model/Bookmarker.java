package com.l3miage.parisenligne.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Bookmarker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "Nom")
	private String nom;

	@Column(name = "Description")
	private String description;

	// Getters and setters

	public void definirEvenement() {

	}

	public void limiter() {

	}

}
