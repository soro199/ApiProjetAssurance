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
public interface ISinistre {
	
	public Sinistre createSinistre(Sinistre ag);
	public List<Sinistre> readSinistre();
	public Sinistre updateSinistreById(Long id, Sinistre ag);
	public void deleteSinistreById(Long id);
	

}
