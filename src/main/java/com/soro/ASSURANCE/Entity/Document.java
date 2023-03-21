package com.soro.ASSURANCE.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.soro.ASSURANCE.Entity.*;

@Entity
@Table(name = "document")

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Document implements Serializable {
	// constructeurs avec les parametres

	public Document(Long id, String fichier, String typeDocument, Utilisateur utilisateur) {
		super();
		this.id = id;
		this.fichier = fichier;
		this.typeDocument = typeDocument;
		this.utilisateur = utilisateur;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fichier;
	private String typeDocument;

	@OneToOne
	@JoinColumn(name = "utilisateur_id")
	// @JsonBackReference
	@JsonIdentityReference(alwaysAsId = true)
	private Utilisateur utilisateur;

	// les getters et setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	public String getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * 
	 */
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

}
