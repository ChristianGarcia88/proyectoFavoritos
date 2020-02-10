package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ForaneaFavorites implements  Serializable{
	
	
	@ManyToOne
	@JoinColumn(name ="id_sitio")
	private  Places  id_sitio;
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private  User  id_usuario; 
	public Places getId_sitio() {
		return id_sitio;
	}
	public void setId_sitio(Places id_sitio) {
		this.id_sitio = id_sitio;
	}
	public User getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(User id_usuario) {
		this.id_usuario = id_usuario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_sitio == null) ? 0 : id_sitio.hashCode());
		result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ForaneaFavorites other = (ForaneaFavorites) obj;
		if (id_sitio == null) {
			if (other.id_sitio != null)
				return false;
		} else if (!id_sitio.equals(other.id_sitio))
			return false;
		if (id_usuario == null) {
			if (other.id_usuario != null)
				return false;
		} else if (!id_usuario.equals(other.id_usuario))
			return false;
		return true;
	}
	public ForaneaFavorites(Places id_sitio, User id_usuario) {
		super();
		this.id_sitio = id_sitio;
		this.id_usuario = id_usuario;
	}
	public ForaneaFavorites() {
		super();
	}
	
	

}
