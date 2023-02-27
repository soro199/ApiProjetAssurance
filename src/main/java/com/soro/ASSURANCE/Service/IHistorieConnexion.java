package com.soro.ASSURANCE.Service;

import java.util.List;

import com.soro.ASSURANCE.Entity.*;



public interface IHistorieConnexion {
	
	public HistorisqueConnexion createHistorisqueConnexion(HistorisqueConnexion ag);
	public List<HistorisqueConnexion> readHistorisqueConnexion();
	public HistorisqueConnexion updateHistorisqueConnexionById(Long id, HistorisqueConnexion ag);
	public void deleteHistorisqueConnexionById(Long id);

}
