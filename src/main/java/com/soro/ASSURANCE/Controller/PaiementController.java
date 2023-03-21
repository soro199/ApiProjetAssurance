/**
 * 
 */
package com.soro.ASSURANCE.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soro.ASSURANCE.Entity.Paiement;
import com.soro.ASSURANCE.Repository.PaiementRepository;
import com.soro.ASSURANCE.Service.PaiementImpl;

import jakarta.transaction.Transactional;

/**
 * @author Administrator
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class PaiementController {

	@Autowired
	public PaiementImpl paiementI;

	@Autowired
	public PaiementRepository paiementR;

	@RequestMapping(value = "/ajoutPaiement", method = RequestMethod.POST)
	public Paiement AjouterPaiement(@RequestBody Paiement ag) {
		return paiementI.createPaiement(ag);
	}

	@RequestMapping(value = "/listePaiement", method = RequestMethod.GET)

	public List<Paiement> listePaiement() {
		// return paiementI.readPaiement();

		return paiementR.findAll();
	}

	@RequestMapping(value = "/afficherPaiement/{id}", method = RequestMethod.GET)
	public Paiement afficherPaiement(@PathVariable Long id) {
		Paiement ag = paiementR.findById(id).orElse(null);

		return ag;

	}

	@DeleteMapping(value = "/deletePaiement/{id}")
	public void deletePaiement(@PathVariable Long id) {

		paiementI.deletePaiementById(id);

	}

	@PutMapping(value = "/updatePaiement/{id}")
	@ResponseBody
	@Transactional
	public Paiement updatePaiement(@RequestBody Paiement U, @PathVariable Long id) {

		U.setId(id);
		paiementR.save(U);
		return U;

	}

}
