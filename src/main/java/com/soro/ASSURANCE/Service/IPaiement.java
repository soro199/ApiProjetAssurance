/**
 * 
 */
package com.soro.ASSURANCE.Service;

import java.util.List;

import com.soro.ASSURANCE.Entity.*;

/**
 * @author Administrator
 *
 */
public interface IPaiement {

	public Paiement createPaiement(Paiement ag);

	public List<Paiement> readPaiement();

	public Paiement updatePaiementById(Long id, Paiement ag);

	public void deletePaiementById(Long id);

}
