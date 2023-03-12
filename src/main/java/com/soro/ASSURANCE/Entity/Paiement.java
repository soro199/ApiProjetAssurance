package com.soro.ASSURANCE.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "paiement")
 
public class Paiement  implements Serializable {

	// les attributs

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	@JsonIgnore
	private Utilisateur utilisateur;

	private LocalDateTime datePaiement;
	private float montant;
	private String modePaiement;

	// constructeurs avec paramettre

	public Paiement(int id, Utilisateur utilisareur, LocalDateTime datePaiement, float montant, String modePaiement) {
		super();
		this.id = id;
		this.utilisateur = utilisareur;
		this.datePaiement = datePaiement;
		this.montant = montant;
		this.modePaiement = modePaiement;
	}

// les getters et setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Utilisateur getUtilisareur() {
		return utilisateur;
	}

	public void setUtilisareur(Utilisateur utilisareur) {
		this.utilisateur = utilisareur;
	}

	public LocalDateTime getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(LocalDateTime datePaiement) {
		this.datePaiement = datePaiement;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public String getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}

}
