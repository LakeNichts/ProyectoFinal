package com.concretepage.service;

import java.util.List;

import com.concretepage.entity.Persona;

public interface IPersonaService {
 	List<Persona> getAllPersona();
 	List<Persona> getAllPacientes();
 //	List<Persona> getAllPacientes2();
    Persona getPersonaById(int personaId);
    void addPersona(Persona persona);
    void updatePersona(Persona persona);
    void deletePersona(int personaId);
}
