package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DaoFavorites;
import com.example.demo.entity.User;

@RestController
public class Controller {

	@Autowired
	private  DaoFavorites  favorites;
	
	@PostMapping("/addFavorites/{id}")
	public    ResponseEntity<?> addFavoritePlace(@RequestBody  User user,@PathVariable("id") Integer id  ){
		
		
		try {
			favorites.addFavorites(user, id);
			return new ResponseEntity<String>("Guardado", HttpStatus.OK);
		} catch (Exception e) {
		
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		
		
		
	}
	
	
	
}
