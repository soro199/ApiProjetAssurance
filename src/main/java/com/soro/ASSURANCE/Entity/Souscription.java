/**
 * 
 */
package com.soro.ASSURANCE.Entity;

import java.io.Serializable;
import java.sql.Date;

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
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 *
 */

@Entity
@Table(name = "souscription")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Souscription implements Serializable {

	// les attributs

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date date_souscription;
	private String description;
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date dateDebut;
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date dateFin;

	@OneToOne
	@JoinColumn(name = "utilisateur_id")
	// @JsonBackReference
	@JsonIdentityReference(alwaysAsId = true)
	private Utilisateur utilisateur;

	@OneToOne
	@JoinColumn(name = "police_id")
	// @JsonBackReference
	@JsonIdentityReference(alwaysAsId = true)
	private PoliceAssurance police;

	// super class

	/**
	 * 
	 */
	public Souscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getters et setters

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the date_souscription
	 */
	public Date getDate_souscription() {
		return date_souscription;
	}

	/**
	 * @param date_souscription the date_souscription to set
	 */
	public void setDate_souscription(Date date_souscription) {
		this.date_souscription = date_souscription;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * @return the police
	 */
	public PoliceAssurance getPolice() {
		return police;
	}

	/**
	 * @param police the police to set
	 */
	public void setPolice(PoliceAssurance police) {
		this.police = police;
	}

	// constructeur avec paramettre
	/**
	 * @param id
	 * @param date_souscription
	 * @param description
	 * @param dateDebut
	 * @param dateFin
	 * @param utilisateur
	 * @param police
	 */
	public Souscription(Long id, Date date_souscription, String description, Date dateDebut, Date dateFin,
			Utilisateur utilisateur, PoliceAssurance police) {
		super();
		this.id = id;
		this.date_souscription = date_souscription;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.utilisateur = utilisateur;
		this.police = police;
	}

}
