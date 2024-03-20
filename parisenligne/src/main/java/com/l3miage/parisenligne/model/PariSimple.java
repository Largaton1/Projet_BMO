// package com.l3miage.parisenligne.model;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;

// import lombok.Data;

// @Entity
// @Data
// public class PariSimple extends Pari {
// 	@Id
// 	@GeneratedValue(strategy = GenerationType.IDENTITY)
// 	@Column(name = "id_pari_simple")
// 	private int idPariSimple;

// 	@ManyToOne
// 	@JoinColumn(name = "pari_id")
// 	private Pari pari;

// }