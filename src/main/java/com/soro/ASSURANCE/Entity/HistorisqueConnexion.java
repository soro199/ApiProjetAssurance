package com.soro.ASSURANCE.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "historie_connexion")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HistorisqueConnexion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	// @JsonBackReference
	@JsonIdentityReference(alwaysAsId = true)
	private Utilisateur utilisateur;

	private Date dateConnexion;
	private String adresseIp;

	// le constructeurs avec paramettres
	public HistorisqueConnexion(Long id, Utilisateur utilisateur, Date dateConnexion, String adresseIp) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.dateConnexion = dateConnexion;
		this.adresseIp = adresseIp;
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

	public Date getDateConnexion() {
		return dateConnexion;
	}

	public void setDateConnexion(Date dateConnexion) {
		this.dateConnexion = dateConnexion;
	}

	public String getAdresseIp() {
		return adresseIp;
	}

	public void setAdresseIp(String adresseIp) {
		this.adresseIp = adresseIp;
	}

	/**
	 * 
	 */
	public HistorisqueConnexion() {
		super();
		// TODO Auto-generated constructor stub
	}

}
