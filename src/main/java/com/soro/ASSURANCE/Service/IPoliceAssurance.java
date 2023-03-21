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
public interface IPoliceAssurance {

	public PoliceAssurance createPoliceAssurance(PoliceAssurance ag);

	public List<PoliceAssurance> readPoliceAssurance();

	public PoliceAssurance updatePoliceAssuranceById(Long id, PoliceAssurance ag);

	public void deletePoliceAssuranceById(Long id);

}
