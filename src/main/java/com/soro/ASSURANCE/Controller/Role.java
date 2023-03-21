/**
 * 
 */
package com.soro.ASSURANCE.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soro.ASSURANCE.Repository.RoleRepository;
import com.soro.ASSURANCE.Service.RoleImpl;

import jakarta.transaction.Transactional;

import com.soro.ASSURANCE.Entity.*;

/**
 * @author Administrator
 *
 */

@RestController
@CrossOrigin(origins = "**")
public class Role {

	@Autowired
	public RoleRepository roleR;

	@Autowired
	public RoleImpl roleI;

	@PostMapping("/ajoutRole")
	public com.soro.ASSURANCE.Entity.Role AjouterRole(@RequestBody com.soro.ASSURANCE.Entity.Role ag) {
		return roleI.createRole(ag);
	}

	@RequestMapping(value = "/listeRole", method = RequestMethod.GET)

	public List<com.soro.ASSURANCE.Entity.Role> listeRoles() {
		return roleI.readRole();
	}

	@RequestMapping(value = "/afficherRole/{id}", method = RequestMethod.GET)
	public com.soro.ASSURANCE.Entity.Role afficherRole(@PathVariable Long id) {

		com.soro.ASSURANCE.Entity.Role ag = roleR.findById(id).orElse(null);

		return ag;

	}

	@DeleteMapping(value = "/deleteRole/{id}")
	public void deleteRole(@PathVariable Long id) {

		roleI.deleteRoleById(id);

	}

	@PutMapping(value = "/updateRole/{id}")
	@ResponseBody
	@Transactional
	public com.soro.ASSURANCE.Entity.Role updateRole(@RequestBody com.soro.ASSURANCE.Entity.Role U,
			@PathVariable Long id) {

		U.setId(id);
		roleR.save(U);
		return U;

	}

}
