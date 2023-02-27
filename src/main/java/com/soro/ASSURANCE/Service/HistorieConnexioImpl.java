package com.soro.ASSURANCE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soro.ASSURANCE.Entity.*;
import com.soro.ASSURANCE.Repository.*;

@Component
public class HistorieConnexioImpl implements IHistorieConnexion {

	@Autowired
	HistorieConnexionRepository historie;
	
	
	@Override
	public HistorisqueConnexion createHistorisqueConnexion(HistorisqueConnexion ag) {
		// TODO Auto-generated method stub
		return historie.save(ag);
	}

	@Override
	public List<HistorisqueConnexion> readHistorisqueConnexion() {
		// TODO Auto-generated method stub
		return historie.findAll();
	}

	@Override
	public HistorisqueConnexion updateHistorisqueConnexionById(Long id, HistorisqueConnexion ag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteHistorisqueConnexionById(Long id) {
		// TODO Auto-generated method stub
		
	historie.deleteById(id);
		
	}


	
	
	

}
