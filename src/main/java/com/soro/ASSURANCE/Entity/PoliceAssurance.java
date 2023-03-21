package com.soro.ASSURANCE.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "police_assurance")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class PoliceAssurance implements Serializable {

	// les attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// liaison
	// souscription
	@OneToMany(mappedBy = "police")
	// @JsonManagedReference
	@JsonIdentityReference(alwaysAsId = true)
	private List<Souscription> souscription;

	private String typePolice;

	private float montantPrime;

	private String description_police;

	// mapping avec sinistres
	@OneToMany(mappedBy = "police")
	// @JsonManagedReference
	@JsonIdentityReference(alwaysAsId = true)
	private List<Sinistre> sinistres;

	/**
	 * 
	 */
	public PoliceAssurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	// le constructeur avec paramette
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
	 * @return the souscription
	 */
	public List<Souscription> getSouscription() {
		return souscription;
	}

	/**
	 * @param souscription the souscription to set
	 */
	public void setSouscription(List<Souscription> souscription) {
		this.souscription = souscription;
	}

	/**
	 * @return the typePolice
	 */
	public String getTypePolice() {
		return typePolice;
	}

	/**
	 * @param typePolice the typePolice to set
	 */
	public void setTypePolice(String typePolice) {
		this.typePolice = typePolice;
	}

	/**
	 * @return the montantPrime
	 */
	public float getMontantPrime() {
		return montantPrime;
	}

	/**
	 * @param montantPrime the montantPrime to set
	 */
	public void setMontantPrime(float montantPrime) {
		this.montantPrime = montantPrime;
	}

	/**
	 * @return the description_police
	 */
	public String getDescription_police() {
		return description_police;
	}

	/**
	 * @param description_police the description_police to set
	 */
	public void setDescription_police(String description_police) {
		this.description_police = description_police;
	}

	/**
	 * @return the sinistres
	 */
	public List<Sinistre> getSinistres() {
		return sinistres;
	}

	/**
	 * @param sinistres the sinistres to set
	 */
	public void setSinistres(List<Sinistre> sinistres) {
		this.sinistres = sinistres;
	}

	// constructeur avec paramettre
	/**
	 * @param id
	 * @param souscription
	 * @param typePolice
	 * @param montantPrime
	 * @param description_police
	 * @param sinistres
	 */
	public PoliceAssurance(Long id, List<Souscription> souscription, String typePolice, float montantPrime,
			String description_police, List<Sinistre> sinistres) {
		super();
		this.id = id;
		this.souscription = souscription;
		this.typePolice = typePolice;
		this.montantPrime = montantPrime;
		this.description_police = description_police;
		this.sinistres = sinistres;
	}

}
