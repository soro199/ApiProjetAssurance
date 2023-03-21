package com.soro.ASSURANCE.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "paiement")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Paiement implements Serializable {

	// les attributs

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date datePaiement;
	private float montant;
	private String modePaiement;

	// @JsonBackReference
	@OneToOne
	@JoinColumn(name = "utilisateur_id", referencedColumnName = "id")
	@JsonIdentityReference(alwaysAsId = true)
	private Utilisateur utilisateur;

	// constructeurs avec paramettre

	public Paiement(Long id, Utilisateur utilisateur, Date datePaiement, float montant, String modePaiement) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.datePaiement = datePaiement;
		this.montant = montant;
		this.modePaiement = modePaiement;
	}

// les getters et setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
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

	/**
	 * 
	 */
	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}

}
