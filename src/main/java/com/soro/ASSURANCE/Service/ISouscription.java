/**
 * 
 */
package com.soro.ASSURANCE.Service;

import java.util.List;

import com.soro.ASSURANCE.Entity.Souscription;

/**
 * @author Administrator
 *
 */

public interface ISouscription {

	public Souscription createSouscription(Souscription ag);

	public List<Souscription> readSouscription();

	public Souscription updateSouscriptionById(Long id, Souscription ag);

	public void deleteSouscriptionById(Long id);

}
