package com.technology.tech.repository;

import com.technology.tech.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<User, Long>,
		JpaRepository<User, Long> {

	User findByUsernameLike(String username);
	
    List<User> findByRolesLike(String role);
	
	
}
