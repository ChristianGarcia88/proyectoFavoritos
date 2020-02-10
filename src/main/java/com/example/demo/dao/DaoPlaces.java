package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Places;
import com.example.demo.repository.placeRepository;




@Service
public class DaoPlaces {
	
	
	@Autowired
	private  placeRepository  placeRepo;

	
	public   Places  searchExistPlace(  Integer  id ) throws Exception {
		
	Places  place=	placeRepo.findById(id).get();
		
		if (place ==null) {
			
			 
			throw  new Exception("usuario no existe");
			
		}
		return place;
		
	}
	
}
