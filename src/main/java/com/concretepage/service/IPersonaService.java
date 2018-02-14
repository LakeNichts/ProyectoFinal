package com.concretepage.service;

import java.util.List;

import com.concretepage.entity.Persona;

public interface IPersonaService {
 	List<Persona> getAllPersona();
 	List<Persona> getAllPacientes();
    Persona getPersonaById(int personaId);
    boolean addPersona(Persona persona);
    void updatePersona(Persona persona);
    void deletePersona(int personaId);
}
