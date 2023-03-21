package com.soro.ASSURANCE.Entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "utilisateur")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Utilisateur implements Serializable {

	// Les attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nom;
	private String prenoms;
	private String tel;
	private String email;
	private String mdp;
	private String dteNaissance;
	private String lieuNaissance;
	private String profession;
	private String situationMatrimoniale;

	// liaison
	// souscription
	@OneToMany(mappedBy = "utilisateur", fetch = FetchType.EAGER)
	@JsonIdentityReference(alwaysAsId = true)
	private List<Souscription> souscription;
	// mapping avec sinistres
	@OneToMany(mappedBy = "utilisateur")
	@JsonIdentityReference(alwaysAsId = true)
	private List<Sinistre> sinistre;

	// mapping avec paiements
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
	@JsonIdentityReference(alwaysAsId = true)
	private List<Paiement> paiement;

	// mapping avec notifications
	@OneToMany(mappedBy = "utilisateur")
	@JsonIdentityReference(alwaysAsId = true)
	private List<Notification> notification;

	// mapping avec documents
	@OneToMany(mappedBy = "utilisateur")
	// @JsonManagedReference
	@JsonIdentityReference(alwaysAsId = true)
	private List<Document> document;

	// mapping avec historique de connexion
	@OneToMany(mappedBy = "utilisateur")
	@JsonIdentityReference(alwaysAsId = true)
	private List<HistorisqueConnexion> historiqueConnexion;

	// role

	@OneToOne
	// @JsonBackReference
	@JsonIdentityReference(alwaysAsId = true)
	@JoinColumn(name = "role_id", referencedColumnName = "id")
	private Role role;

	// super class

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	// les getters et les setters
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenoms
	 */
	public String getPrenoms() {
		return prenoms;
	}

	/**
	 * @param prenoms the prenoms to set
	 */
	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}

	/**
	 * @param mdp the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	/**
	 * @return the dteNaissance
	 */
	public String getDteNaissance() {
		return dteNaissance;
	}

	/**
	 * @param dteNaissance the dteNaissance to set
	 */
	public void setDteNaissance(String dteNaissance) {
		this.dteNaissance = dteNaissance;
	}

	/**
	 * @return the lieuNaissance
	 */
	public String getLieuNaissance() {
		return lieuNaissance;
	}

	/**
	 * @param lieuNaissance the lieuNaissance to set
	 */
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * @return the situationMatrimoniale
	 */
	public String getSituationMatrimoniale() {
		return situationMatrimoniale;
	}

	/**
	 * @param situationMatrimoniale the situationMatrimoniale to set
	 */
	public void setSituationMatrimoniale(String situationMatrimoniale) {
		this.situationMatrimoniale = situationMatrimoniale;
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
	 * @return the sinistre
	 */
	public List<Sinistre> getSinistre() {
		return sinistre;
	}

	/**
	 * @param sinistre the sinistre to set
	 */
	public void setSinistre(List<Sinistre> sinistre) {
		this.sinistre = sinistre;
	}

	/**
	 * @return the paiement
	 */
	public List<Paiement> getPaiement() {
		return paiement;
	}

	/**
	 * @param paiement the paiement to set
	 */
	public void setPaiement(List<Paiement> paiement) {
		this.paiement = paiement;
	}

	/**
	 * @return the notification
	 */
	public List<Notification> getNotification() {
		return notification;
	}

	/**
	 * @param notification the notification to set
	 */
	public void setNotification(List<Notification> notification) {
		this.notification = notification;
	}

	/**
	 * @return the document
	 */
	public List<Document> getDocument() {
		return document;
	}

	/**
	 * @param document the document to set
	 */
	public void setDocument(List<Document> document) {
		this.document = document;
	}

	/**
	 * @return the historiqueConnexion
	 */
	public List<HistorisqueConnexion> getHistoriqueConnexion() {
		return historiqueConnexion;
	}

	/**
	 * @param historiqueConnexion the historiqueConnexion to set
	 */
	public void setHistoriqueConnexion(List<HistorisqueConnexion> historiqueConnexion) {
		this.historiqueConnexion = historiqueConnexion;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	// constructeur avec paramettre
	/**
	 * @param id
	 * @param nom
	 * @param prenoms
	 * @param tel
	 * @param email
	 * @param mdp
	 * @param dteNaissance
	 * @param lieuNaissance
	 * @param profession
	 * @param situationMatrimoniale
	 * @param souscription
	 * @param sinistre
	 * @param paiement
	 * @param notification
	 * @param document
	 * @param historiqueConnexion
	 * @param role
	 */
	public Utilisateur(Long id, String nom, String prenoms, String tel, String email, String mdp, String dteNaissance,
			String lieuNaissance, String profession, String situationMatrimoniale, List<Souscription> souscription,
			List<Sinistre> sinistre, List<Paiement> paiement, List<Notification> notification, List<Document> document,
			List<HistorisqueConnexion> historiqueConnexion, Role role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenoms = prenoms;
		this.tel = tel;
		this.email = email;
		this.mdp = mdp;
		this.dteNaissance = dteNaissance;
		this.lieuNaissance = lieuNaissance;
		this.profession = profession;
		this.situationMatrimoniale = situationMatrimoniale;
		this.souscription = souscription;
		this.sinistre = sinistre;
		this.paiement = paiement;
		this.notification = notification;
		this.document = document;
		this.historiqueConnexion = historiqueConnexion;
		this.role = role;
	}

}
