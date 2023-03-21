package com.soro.ASSURANCE.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soro.ASSURANCE.Entity.Document;
import com.soro.ASSURANCE.Entity.HistorisqueConnexion;
import com.soro.ASSURANCE.Repository.HistorieConnexionRepository;
import com.soro.ASSURANCE.Service.HistorieConnexioImpl;

import jakarta.transaction.Transactional;

@RestController
public class HistorieConnexionController {

	@Autowired
	HistorieConnexioImpl historieI;
	@Autowired
	HistorieConnexionRepository historieR;

	@RequestMapping(value = "/ajouteHist", method = RequestMethod.POST)
	public HistorisqueConnexion AjouterHistorie(@RequestBody HistorisqueConnexion his) {
		return historieI.createHistorisqueConnexion(his);

	}

	@RequestMapping(value = "/listeHistorie", method = RequestMethod.GET)

	public List<HistorisqueConnexion> listeHistorie() {
		return historieI.readHistorisqueConnexion();
	}

	@RequestMapping(value = "/afficherHistorique/{id}", method = RequestMethod.GET)
	public HistorisqueConnexion afficherHistorie(@PathVariable Long id) {

		HistorisqueConnexion his = historieR.findById(id).orElse(null);

		return his;

	}

	@DeleteMapping(value = "/deleteHistorie/{id}")
	public void deleteHistorie(@PathVariable Long id) {
		historieI.deleteHistorisqueConnexionById(id);

	}

	@PutMapping(value = "/updateHistorie/{id}")
	@ResponseBody
	@Transactional
	public HistorisqueConnexion updateHistorie(@RequestBody HistorisqueConnexion H, @PathVariable Long id) {

		H.setId(id);
		historieR.save(H);
		return H;

	}

}
