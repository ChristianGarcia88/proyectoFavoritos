package com.example.demo.dao;

import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Favorites;
import com.example.demo.entity.ForaneaFavorites;
import com.example.demo.entity.Places;
import com.example.demo.entity.User;
import com.example.demo.repository.RepositoryFavorites;
import com.example.demo.repository.placeRepository;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



@Service
public class DaoFavorites {


	
	private Logger  log= LogManager.getLogger(DaoFavorites.class);
	@Autowired
	private DaoPlaces  placeDao;
	@Autowired
	private RepositoryFavorites  repoFavorites ; 
	
	public   void  addFavorites(User  user ,  Integer id ) throws Exception {
		
		
		try {
			System.out.println("-----------------------------------------------------------------");
			System.out.println(user.getEmail() + user.getLastname()+  user.getUsername());
			Places place  = placeDao.searchExistPlace(id);
			System.out.println("-----------------------------------------------------------------");
			System.out.println(place.getPlace() + place.getId_place());
			Favorites favorite= new Favorites();
			favorite.setForanea(new ForaneaFavorites(place, user));
	
		   repoFavorites.save(favorite);
		} catch (Exception e) {
		
	      log.info(e.getMessage());
	      throw   new Exception (e.getMessage());
		}
		
		
		
		
	}
	
	
	
}
