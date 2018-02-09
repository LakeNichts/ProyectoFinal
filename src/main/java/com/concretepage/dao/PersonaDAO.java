package com.concretepage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.Persona;
@Transactional
@Repository
public class PersonaDAO implements IPersonaDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	@SuppressWarnings("unchecked")
	@Override
	public List<Persona> getAllPersona() {
		String hql = "FROM Persona ";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Persona> getAllPacientes() {
		String hql = "FROM Persona as p where tipoPersona='PACIENTE' ORDER BY obrasocial ";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}
	/*
	@Override
	public List<Persona> getAllPacientes2() {
		//return pacienterepository.findAll();
		return null;
	}*/

	@Override
	public Persona getPersonaById(int personaId) {
		return entityManager.find(Persona.class, personaId);
	}

	@Override
	public void addPersona(Persona persona) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePersona(Persona persona) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePersona(int personaId) {
		// TODO Auto-generated method stub

	}

}
