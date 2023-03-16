/**
 * 
 */
package com.soro.ASSURANCE.Entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 *
 */

@Entity
@Table(name= "role")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Role implements Serializable  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String libelle_role;
	
	
	//role
  	@OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
  	//@JsonManagedReference
  	@JsonIdentityReference(alwaysAsId = true)
  	private List<Utilisateur> utilisateur;


  	
  //getters setters
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
	 * @return the libelle_role
	 */
	public String getLibelle_role() {
		return libelle_role;
	}


	/**
	 * @param libelle_role the libelle_role to set
	 */
	public void setLibelle_role(String libelle_role) {
		this.libelle_role = libelle_role;
	}


	/**
	 * @return the utilisateur
	 */
	public List<Utilisateur> getUtilisateur() {
		return utilisateur;
	}


	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(List<Utilisateur> utilisateur) {
		this.utilisateur = utilisateur;
	}

	
	//constructeur avec et sans paramettre

	/**
	 * @param id
	 * @param libelle_role
	 * @param utilisateur
	 */
	public Role(Long id, String libelle_role, List<Utilisateur> utilisateur) {
		super();
		this.id = id;
		this.libelle_role = libelle_role;
		this.utilisateur = utilisateur;
	}


	/**
	 * 
	 */
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
  	
	
	
	
	
	
	
  	
  	
  	
  	
  	
  	

}
