/**
 * 
 */
package com.soro.ASSURANCE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.soro.ASSURANCE.Entity.*;
import com.soro.ASSURANCE.Repository.*;

/**
 * @author Administrator
 *
 */

@Component
public class PoliceAssuranceImpl implements IPoliceAssurance {

	@Autowired
	PoliceAssuranceRepository police;

	@Override
	public PoliceAssurance createPoliceAssurance(PoliceAssurance ag) {
		// TODO Auto-generated method stub
		return police.save(ag);
	}

	@Override
	public List<PoliceAssurance> readPoliceAssurance() {
		// TODO Auto-generated method stub
		return police.findAll();
	}

	@Override
	public PoliceAssurance updatePoliceAssuranceById(Long id, PoliceAssurance ag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePoliceAssuranceById(Long id) {
		// TODO Auto-generated method stub

		police.deleteById(id);
	}

}
