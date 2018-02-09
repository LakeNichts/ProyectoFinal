package com.concretepage.dao;

import java.util.List;

import com.concretepage.entity.Persona;

public interface IPersonaDAO {
 	List<Persona> getAllPersona();
 	List<Persona> getAllPacientes();
 	//List<Persona> getAllPacientes2();
    Persona getPersonaById(int personaId);
    void addPersona(Persona persona);
    void updatePersona(Persona persona);
    void deletePersona(int personaId);
    //boolean personaExists(String title, String category);
}
