package com.concretepage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="obras_sociales")
public class ObraSocial implements Serializable {
	private static final long serialVersionUID = 1L; 
	@Id
	@Column(name="obra_social_id")
    private int obrasocial_id;  
	@Column(name="nombre")
    private String nombre;
	public int getObrasocial_id() {
		return obrasocial_id;
	}
	public void setObrasocial_id(int obrasocial_id) {
		this.obrasocial_id = obrasocial_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
