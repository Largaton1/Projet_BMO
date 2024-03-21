package com.l3miage.parisenligne.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
public class Bookmarker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
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
