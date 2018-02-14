package com.concretepage.entity;
import java.io.Serializable;
import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="personas")
public class Persona implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="persona_id")
    private int personaId;  
	@Column(name="usuario")
    private String usuario;
	@Column(name="clave")
    private String clave;
	@Column(name="nombre")	
	private String nombre;
	@Column(name="e_mail")	
	private String email;
	@Column(name="telefono")	
	private String telefono;
	@ManyToOne
	@JoinColumn(name="obra_social_id")
    private ObraSocial obrasocial;
	@ManyToOne
	@JoinColumn(name="especialidad_id")
    private Especialidad especialidad;
	@Column(name="estado")	
	private String estado;
	@Column(name="fecha_creacion")	
	private Date fechacreacion;
	@Column(name="tipo_persona")	
	private String tipoPersona;

	public int getPersonaId() {
		return personaId;
	}
	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getTipoPersona() {
		return tipoPersona;
	}
	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}
	public ObraSocial getObrasocial() {
		return obrasocial;
	}
	public void setObrasocial(ObraSocial obrasocial) {
		this.obrasocial = obrasocial;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
} 