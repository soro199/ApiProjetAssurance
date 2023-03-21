/**
 * 
 */
package com.soro.ASSURANCE.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

import com.soro.ASSURANCE.Entity.PoliceAssurance;
import com.soro.ASSURANCE.Entity.Utilisateur;
import com.soro.ASSURANCE.Repository.PoliceAssuranceRepository;
import com.soro.ASSURANCE.Service.PoliceAssuranceImpl;

import jakarta.transaction.Transactional;

/**
 * @author Administrator
 *
 */

@RestController
public class PoliceAssuranceController {

	@Autowired
	public PoliceAssuranceRepository policeR;

	@Autowired
	public PoliceAssuranceImpl policeI;

	@PostMapping(value = "/ajoutPolice")
	public PoliceAssurance AjouterPolice(@RequestBody PoliceAssurance pa) {

		return policeI.createPoliceAssurance(pa);

	}

	@GetMapping(value = "/listePolice")
	public List<PoliceAssurance> listPolice() {
		return policeI.readPoliceAssurance();
	}

	@RequestMapping(value = "/afficherPolice/{id}", method = RequestMethod.GET)
	public PoliceAssurance afficherPolice(@PathVariable Long id) {

		PoliceAssurance ag = policeR.findById(id).orElse(null);

		return ag;

	}

	@DeleteMapping(value = "/deletePolice/{id}")
	public void deletePolice(@PathVariable Long id) {
		policeI.deletePoliceAssuranceById(id);

	}

	@PutMapping(value = "/updatePolice/{id}")
	@ResponseBody
	@Transactional
	public PoliceAssurance updatePolice(@RequestBody PoliceAssurance P, @PathVariable Long id) {

		P.setId(id);
		policeR.save(P);

		return P;
	}

}
