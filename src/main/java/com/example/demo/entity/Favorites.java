package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ManyToAny;

@Table
@Entity
public class Favorites {
@EmbeddedId
	private  ForaneaFavorites foranea;

	public ForaneaFavorites getForanea() {
		return foranea;
	}

	public void setForanea(ForaneaFavorites foranea) {
		this.foranea = foranea;
	}
	
	
	
	
	


	
	
}
