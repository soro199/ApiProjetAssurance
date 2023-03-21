package com.soro.ASSURANCE.Service;

import java.util.List;

import com.soro.ASSURANCE.Entity.*;

public interface IUtilisateur {

	public Utilisateur createUtilisateur(Utilisateur ag);

	public List<Utilisateur> readUtilisateur();

	public Utilisateur updateUtilisateurById(Long id, Utilisateur ag);

	public void deleteUtilisateurById(Long id);

}
