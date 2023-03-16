package com.soro.ASSURANCE.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "sinistre")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Sinistre implements Serializable   {
	// attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	//@JsonIgnore
	private Utilisateur utilisateur;

	@ManyToOne
	@JoinColumn(name = "police_assurance_id")

	private PoliceAssurance police;

	private String typeSinistre;
	private LocalDateTime dateSinistre;
	private String description;
	private float montant;
	private String document;

	// le constructeur avec paramettre

	public Sinistre(int id, Utilisateur utilisateur, PoliceAssurance police, String typeSinistre,
			LocalDateTime dateSinistre, String description, float montant, String document) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.police = police;
		this.typeSinistre = typeSinistre;
		this.dateSinistre = dateSinistre;
		this.description = description;
		this.montant = montant;
		this.document = document;
	}

	// les getters et les setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public PoliceAssurance getPolice() {
		return police;
	}

	public void setPolice(PoliceAssurance police) {
		this.police = police;
	}

	public String getTypeSinistre() {
		return typeSinistre;
	}

	public void setTypeSinistre(String typeSinistre) {
		this.typeSinistre = typeSinistre;
	}

	public LocalDateTime getDateSinistre() {
		return dateSinistre;
	}

	public void setDateSinistre(LocalDateTime dateSinistre) {
		this.dateSinistre = dateSinistre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

}
