/**
 * 
 */
package com.soro.ASSURANCE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.soro.ASSURANCE.Entity.*;
import com.soro.ASSURANCE.Repository.*;

/**
 * @author Administrator
 *
 */
public class SinistreImpl implements ISinistre {

	@Autowired
	SinistreRepository sinistre;

	@Override
	public Sinistre createSinistre(Sinistre ag) {
		// TODO Auto-generated method stub
		return sinistre.save(ag);
	}

	@Override
	public List<Sinistre> readSinistre() {
		// TODO Auto-generated method stub
		return sinistre.findAll();
	}

	@Override
	public Sinistre updateSinistreById(Long id, Sinistre ag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSinistreById(Long id) {
		// TODO Auto-generated method stub

		sinistre.deleteById(id);

	}

}
