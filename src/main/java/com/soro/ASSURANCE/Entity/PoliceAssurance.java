package com.soro.ASSURANCE.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "police_assurance")
@NoArgsConstructor
public class PoliceAssurance  implements Serializable {

	// les attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	@JsonIgnore
	private Utilisateur utilisateur;

	private String typePolice;
	 @DateTimeFormat(pattern = "yyy-MM-dd")
	private Date dateDebut;
	 @DateTimeFormat(pattern = "yyy-MM-dd")
	private Date dateFin;
	private float montantPrime;
	 @DateTimeFormat(pattern = "yyy-MM-dd")
	private Date dateSoucription;

	// mapping avec sinistres
	@OneToMany(mappedBy = "police")
	private List<Sinistre> sinistres;

	// le constructeur avec paramette

	public PoliceAssurance(Long id, Utilisateur utilisateur, String typePolice, Date dateDebut,
			Date dateFin, float montantPrime, Date dateSoucription, List<Sinistre> sinistres) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.typePolice = typePolice;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.montantPrime = montantPrime;
		this.dateSoucription = dateSoucription;
		this.sinistres = sinistres;
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

	public String getTypePolice() {
		return typePolice;
	}

	public void setTypePolice(String typePolice) {
		this.typePolice = typePolice;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public float getMontantPrime() {
		return montantPrime;
	}

	public void setMontantPrime(float montantPrime) {
		this.montantPrime = montantPrime;
	}

	public Date getDateSoucription() {
		return dateSoucription;
	}

	public void setDateSoucription(Date dateSoucription) {
		this.dateSoucription = dateSoucription;
	}

	public List<Sinistre> getSinistres() {
		return sinistres;
	}

	public void setSinistres(List<Sinistre> sinistres) {
		this.sinistres = sinistres;
	}

	/**
	 * 
	 */
	public PoliceAssurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
