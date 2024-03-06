package com.l3miage.parisenligne.model;
import java.util.*;

import javax.persistence.*;

@Entity
public class Paris {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_pari")
    private int idPari;
    


	@Column(name = "montant_min")
    private int montantMin;
    
    @Column(name = "montant_max")
    private int montantMax;
    
    @OneToMany(mappedBy = "paris")
    private List<Ticket> tickets;
    
    @ManyToOne
    @JoinColumn(name = "parieur_id")
    private Parieur parieur;
    
    // Getters and setters
    public int getIdPari() {
		return idPari;
	}

	public void setIdPari(int idPari) {
		this.idPari = idPari;
	}

	public int getMontantMin() {
		return montantMin;
	}

	public void setMontantMin(int montantMin) {
		this.montantMin = montantMin;
	}

	public int getMontantMax() {
		return montantMax;
	}

	public void setMontantMax(int montantMax) {
		this.montantMax = montantMax;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Parieur getParieur() {
		return parieur;
	}

	public void setParieur(Parieur parieur) {
		this.parieur = parieur;
	}
}

