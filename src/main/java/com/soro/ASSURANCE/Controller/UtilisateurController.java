/**
 * 
 */
package com.soro.ASSURANCE.Controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soro.ASSURANCE.Entity.Utilisateur;
import com.soro.ASSURANCE.Repository.UtilisateurRepository;
import com.soro.ASSURANCE.Service.UtilisateurImpl;

import jakarta.transaction.Transactional;

/**
 * @author Administrator
 *
 */

@RestController


public class UtilisateurController {

	@Autowired
	public UtilisateurRepository utilisateurRepository;
	
	@Autowired
	public UtilisateurImpl utilisateurImpl;
	
	
	@PostMapping("/ajout/utilisateur")
	
	public Utilisateur AjouterUtilisateur(@RequestBody Utilisateur ag) {
		
		return utilisateurImpl.createUtilisateur(ag);
		
		
		
	}
	
	@RequestMapping(value="/listeUtilisateur", method = RequestMethod.GET)

	public List<Utilisateur> listeUtilisateur(){		
		return utilisateurImpl.readUtilisateur();
	}
	

	@RequestMapping(value="/afficherUtilisateur/{id}", method = RequestMethod.GET)
	public Utilisateur afficherUtilisateur(@PathVariable Long id){
		
		Utilisateur ag = utilisateurRepository.findById(id).orElse(null);
		
		return ag;
		
	}
	
	
	@DeleteMapping(value="/deleteUtilisateur/{id}")
	public void deleteUtilisateur(@PathVariable Long id) {
	utilisateurImpl.deleteUtilisateurById(id);
	
	
	
	}
	
	@PutMapping(value="/updateUtilisateur/{id}")
	@ResponseBody
	@Transactional
	public Utilisateur updateUtilisareur(@RequestBody Utilisateur U, @PathVariable Long id) {
		
		U.setId(id);
		utilisateurRepository.save(U);
		return U;

		
		
	}
}
