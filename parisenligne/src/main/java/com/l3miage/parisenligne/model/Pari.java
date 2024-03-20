package com.l3miage.parisenligne.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Pari {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id_pari")
	private int idPari;

	@Column(name = "montant_min")
	private int montantMin;

	@Column(name = "montant_max")
	private int montantMax;

	@ManyToOne
	@JoinColumn(name = "parieur_id")
	private Parieur parieur;

	

	// public List<Ticket> getTickets() {
	// return tickets;
	// }

	// public void setTickets(List<Ticket> tickets) {
	// this.tickets = tickets;
	// }

}
