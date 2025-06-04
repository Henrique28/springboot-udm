package com.henrique.udm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.udm.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
