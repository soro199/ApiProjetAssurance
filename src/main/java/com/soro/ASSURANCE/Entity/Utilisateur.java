package com.soro.ASSURANCE.Entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "utilisateur")
@NoArgsConstructor
public class Utilisateur  {
	
	//Les attributs 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom ;
	private String prenoms;
	private String tel;
	private String email;
	private String mdp;
	private String dteNaissance;
	private String lieuNaissance;
	private String profession;
	private String situationMatrimoniale;
	
	//liaison 
	  //policeAssurance
	@OneToMany(mappedBy = "utilisateur")
	private List<PoliceAssurance> police;
	 // mapping avec sinistres
    @OneToMany(mappedBy = "utilisateur")
    private List<Sinistre> sinistre;

    // mapping avec paiements
    @OneToMany(mappedBy = "utilisateur")
    private List<Paiement> paiement;

    // mapping avec notifications
    @OneToMany(mappedBy = "utilisateur")
    private List<Notification> notification;

    // mapping avec documents
    @OneToMany(mappedBy = "utilisateur")
    private List<Document> document;

    // mapping avec historique de connexion
    @OneToMany(mappedBy = "utilisateur")
    private List<HistorisqueConnexion> historiqueConnexion;

	
      
    //constructeur avec paramettre
    
    public Utilisateur(Long id, String nom, String prenoms, String tel, String email, String mdp, String dteNaissance,
			String lieuNaissance, String profession, String situationMatrimoniale, List<PoliceAssurance> polices,
			List<Sinistre> sinistres, List<Paiement> paiements, List<Notification> notifications,
			List<Document> documents, List<HistorisqueConnexion> historiqueConnexions) {
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
		this.police = polices;
		this.sinistre = sinistres;
		this.paiement= paiements;
		this.notification = notifications;
		this.document = documents;
		this.historiqueConnexion = historiqueConnexions;
	}

    // les getters et les setters

	public Long getId() {
		return id;
	}



	public void setId(Long id2) {
		this.id = id2;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenoms() {
		return prenoms;
	}



	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMdp() {
		return mdp;
	}



	public void setMdp(String mdp) {
		this.mdp = mdp;
	}



	public String getDteNaissance() {
		return dteNaissance;
	}



	public void setDteNaissance(String dteNaissance) {
		this.dteNaissance = dteNaissance;
	}



	public String getLieuNaissance() {
		return lieuNaissance;
	}



	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}



	public String getProfession() {
		return profession;
	}



	public void setProfession(String profession) {
		this.profession = profession;
	}



	public String getSituationMatrimoniale() {
		return situationMatrimoniale;
	}



	public void setSituationMatrimoniale(String situationMatrimoniale) {
		this.situationMatrimoniale = situationMatrimoniale;
	}



	public List<PoliceAssurance> getPolices() {
		return police;
	}



	public void setPolices(List<PoliceAssurance> polices) {
		this.police = polices;
	}



	public List<Sinistre> getSinistres() {
		return sinistre;
	}



	public void setSinistres(List<Sinistre> sinistres) {
		this.sinistre = sinistres;
	}



	public List<Paiement> getPaiements() {
		return paiement;
	}



	public void setPaiements(List<Paiement> paiements) {
		this.paiement = paiements;
	}



	public List<Notification> getNotifications() {
		return notification;
	}



	public void setNotifications(List<Notification> notifications) {
		this.notification = notifications;
	}



	public List<Document> getDocuments() {
		return document;
	}



	public void setDocuments(List<Document> documents) {
		this.document = documents;
	}



	public List<HistorisqueConnexion> getHistoriqueConnexions() {
		return historiqueConnexion;
	}



	public void setHistoriqueConnexions(List<HistorisqueConnexion> historiqueConnexions) {
		this.historiqueConnexion = historiqueConnexions;
	}

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
  
    
    
    
    
    
    
    
    
	
	
	
	

}
