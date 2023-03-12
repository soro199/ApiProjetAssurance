package com.soro.ASSURANCE.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "notification")
 
public class Notification  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "utilisateur_id")

	@JsonIgnore
	private Utilisateur utilisateur;

	private String typeNotificaion;
	private Date dateEnvoi;
	private String contenu;
	
	
	//constructeurs avec paramettre
	public Notification(Long id, Utilisateur utilisateur, String typeNotificaion, Date dateEnvoi,
			String contenu) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.typeNotificaion = typeNotificaion;
		this.dateEnvoi = dateEnvoi;
		this.contenu = contenu;
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
	public String getTypeNotificaion() {
		return typeNotificaion;
	}
	public void setTypeNotificaion(String typeNotificaion) {
		this.typeNotificaion = typeNotificaion;
	}
	public Date getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}


	/**
	 * 
	 */
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
