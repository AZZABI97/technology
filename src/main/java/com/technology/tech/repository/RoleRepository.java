package com.technology.tech.repository;

import com.technology.tech.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByRole(String role);

}
