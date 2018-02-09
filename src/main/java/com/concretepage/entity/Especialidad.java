package com.concretepage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="especialidades")
public class Especialidad implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="especialidad_id")
    private int especialida_id;  
	@Column(name="descripcion")
    private String descripcion;
	public int getEspecialida_id() {
		return especialida_id;
	}
	public void setEspecialida_id(int especialida_id) {
		this.especialida_id = especialida_id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
