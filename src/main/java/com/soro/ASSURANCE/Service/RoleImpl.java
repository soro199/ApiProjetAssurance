/**
 * 
 */
package com.soro.ASSURANCE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soro.ASSURANCE.Entity.Role;
import com.soro.ASSURANCE.Repository.RoleRepository;

/**
 * @author Administrator
 *
 */
@Component
public class RoleImpl implements IRole {

	@Autowired
	RoleRepository role;

	@Override
	public Role createRole(Role ag) {
		// TODO Auto-generated method stub
		return role.save(ag);
	}

	@Override
	public List<Role> readRole() {
		// TODO Auto-generated method stub
		return role.findAll();
	}

	@Override
	public Role updateRoleById(Long id, Role ag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRoleById(Long id) {
		// TODO Auto-generated method stub
		role.deleteById(id);
	}

	@Override
	public Role findonRole(Long id) {
		// TODO Auto-generated method stub
		return this.role.findById(id).get();
	}

}
