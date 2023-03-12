/**
 * 
 */
package com.soro.ASSURANCE.Service;

import java.util.List;

import com.soro.ASSURANCE.Entity.Role;


/**
 * @author Administrator
 *
 */
public interface IRole {

	public Role createRole(Role ag);
	public List<Role> readRole();
	public Role updateRoleById(Long id, Role ag);
	public void deleteRoleById(Long id);
}
