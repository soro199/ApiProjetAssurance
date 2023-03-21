/**
 * 
 */
package com.soro.ASSURANCE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soro.ASSURANCE.Entity.*;
import com.soro.ASSURANCE.Repository.*;

/**
 * @author Administrator
 *
 */
@Component
public class UtilisateurImpl implements IUtilisateur {

	@Autowired
	UtilisateurRepository utilisateur;

	@Override
	public Utilisateur createUtilisateur(Utilisateur ag) {
		// TODO Auto-generated method stub
		return utilisateur.save(ag);
	}

	@Override
	public List<Utilisateur> readUtilisateur() {
		// TODO Auto-generated method stub
		return utilisateur.findAll();
	}

	@Override
	public Utilisateur updateUtilisateurById(Long id, Utilisateur ag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUtilisateurById(Long id) {
		// TODO Auto-generated method stub

		utilisateur.deleteById(id);
	}

}
