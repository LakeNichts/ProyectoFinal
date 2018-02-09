package com.concretepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.concretepage.dao.IPersonaDAO;
import com.concretepage.entity.Persona;
@Service
public class PersonaService implements IPersonaService {
	@Autowired
	private IPersonaDAO personaDAO;
	@Override
	public List<Persona> getAllPersona() {
		return personaDAO.getAllPersona();
	}
	@Override
	public List<Persona> getAllPacientes() {
		return personaDAO.getAllPacientes();
	}/*
	@Override
	public List<Persona> getAllPacientes2() {
		return personaDAO.getAllPacientes2();
	}*/
	
	@Override
	public Persona getPersonaById(int personaId) {
		// TODO Auto-generated method stub
		return null;
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
