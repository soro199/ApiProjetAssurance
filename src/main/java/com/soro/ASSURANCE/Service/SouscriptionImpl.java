/**
 * 
 */
package com.soro.ASSURANCE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soro.ASSURANCE.Entity.*;
import com.soro.ASSURANCE.Repository.*;

/**
 * @author Administrator
 *
 */
@Component
public class SouscriptionImpl implements ISouscription {

	@Autowired
	SouscriptionRepository souscription;

	@Override
	public Souscription createSouscription(Souscription ag) {
		// TODO Auto-generated method stub
		return souscription.save(ag);
	}

	@Override
	public List<Souscription> readSouscription() {
		// TODO Auto-generated method stub
		return souscription.findAll();
	}

	@Override
	public Souscription updateSouscriptionById(Long id, Souscription ag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSouscriptionById(Long id) {
		// TODO Auto-generated method stub

		souscription.deleteById(id);
	}

}
