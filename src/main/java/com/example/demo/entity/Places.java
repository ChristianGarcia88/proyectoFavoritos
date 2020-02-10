package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Table
@Entity
public class Places {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer  id_place;
	@Column
	private  String  place;
	
	

	public Integer getId_place() {
		return id_place;
	}

	public void setId_place(Integer id_place) {
		this.id_place = id_place;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Places(Integer id_place, String place) {
		super();
		this.id_place = id_place;
		this.place = place;
	}

	public Places() {
		super();
	}

	
	
}
