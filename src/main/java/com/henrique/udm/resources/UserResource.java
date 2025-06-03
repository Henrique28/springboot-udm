package com.henrique.udm.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henrique.udm.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User e = new User(1L, "Carlos", "carlos@gamil.com", "1198877676", "222222");
		return ResponseEntity.ok().body(e);
	}
	
}
