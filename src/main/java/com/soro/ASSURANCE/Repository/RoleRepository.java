/**
 * 
 */
package com.soro.ASSURANCE.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soro.ASSURANCE.Entity.Role;

/**
 * @author Administrator
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
