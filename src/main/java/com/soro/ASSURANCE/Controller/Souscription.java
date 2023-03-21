/**
 * 
 */
package com.soro.ASSURANCE.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soro.ASSURANCE.Repository.SouscriptionRepository;
import com.soro.ASSURANCE.Service.SouscriptionImpl;

import jakarta.transaction.Transactional;

/**
 * @author Administrator
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class Souscription {

	@Autowired
	SouscriptionRepository souscriptionR;
	@Autowired
	SouscriptionImpl souscriptionI;

	@PostMapping("/ajoutSouscription")

	public com.soro.ASSURANCE.Entity.Souscription AjouterUtilisateur(
			@RequestBody com.soro.ASSURANCE.Entity.Souscription ag) {

		return souscriptionI.createSouscription(ag);

	}

	@RequestMapping(value = "/listeSouscription", method = RequestMethod.GET)

	public List<com.soro.ASSURANCE.Entity.Souscription> listeScription() {
		return souscriptionI.readSouscription();
	}

	@RequestMapping(value = "/afficherSouscription/{id}", method = RequestMethod.GET)
	public com.soro.ASSURANCE.Entity.Souscription afficherSouscription(@PathVariable Long id) {

		com.soro.ASSURANCE.Entity.Souscription ag = souscriptionR.findById(id).orElse(null);

		return ag;

	}

	@DeleteMapping(value = "/deleteSouscription/{id}")
	public void deleteSouscription(@PathVariable Long id) {
		souscriptionI.deleteSouscriptionById(id);

	}

	@PutMapping(value = "/updateSouscription/{id}")
	@ResponseBody
	@Transactional
	public com.soro.ASSURANCE.Entity.Souscription updateSouscription(
			@RequestBody com.soro.ASSURANCE.Entity.Souscription U, @PathVariable Long id) {

		U.setId(id);
		souscriptionR.save(U);
		return U;

	}

}
