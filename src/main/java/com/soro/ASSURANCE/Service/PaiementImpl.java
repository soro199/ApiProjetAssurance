package com.soro.ASSURANCE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soro.ASSURANCE.Entity.*;
import com.soro.ASSURANCE.Repository.*;

@Component
public class PaiementImpl implements IPaiement {

	@Autowired
	PaiementRepository paiement;

	@Override
	public Paiement createPaiement(Paiement ag) {
		// TODO Auto-generated method stub
		return paiement.save(ag);
	}

	@Override
	public List<Paiement> readPaiement() {
		// TODO Auto-generated method stub
		return paiement.findAll();
	}

	@Override
	public Paiement updatePaiementById(Long id, Paiement ag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePaiementById(Long id) {
		// TODO Auto-generated method stub

		paiement.deleteById(id);
	}

}
