// package com.l3miage.parisenligne.model;

// import javax.persistence.*;

// @Entity
// public class PariSimple extends Paris {
//     @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
//     @Column(name = "id_pari_simple")
//     private int idPariSimple;
    
// 	@ManyToOne
//     @JoinColumn(name = "paris_id")
//     private Paris paris;
    
//     // Getters and setters
// 	  public int getIdPariSimple() {
// 			return idPariSimple;
// 		}

// 		public void setIdPariSimple(int idPariSimple) {
// 			this.idPariSimple = idPariSimple;
// 		}

// 		public Paris getParis() {
// 			return paris;
// 		}

// 		public void setParis(Paris paris) {
// 			this.paris = paris;
// 		}
// }
