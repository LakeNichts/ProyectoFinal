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
	}
	
	@Override
	public Persona getPersonaById(int personaId) {
		Persona obj = personaDAO.getPersonaById(personaId);
		if(obj.getTipoPersona().equals("MEDICO")) {
			return obj;	
		}
			return null;
	}


	@Override
	public synchronized boolean addPersona(Persona persona){
       if (personaDAO.personaExists(persona.getNombre(), persona.getTipoPersona())) {
    	   return false;
       } else {
    	   personaDAO.addPersona(persona);
    	   return true;
       }
	}
	
	@Override
	public void updatePersona(Persona persona) {
		personaDAO.updatePersona(persona);
	}

	@Override
	public void deletePersona(int personaId) {
		personaDAO.deletePersona(personaId);
	}
	
}
