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
		String hql = "FROM Persona as p where tipoPersona='MEDICO' ";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Persona> getAllPacientes() {
		String hql = "FROM Persona as p where tipoPersona='PACIENTE' ORDER BY obrasocial ";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Persona getPersonaById(int personaId) {
		return entityManager.find(Persona.class, personaId);
	}

	@Override
	public void addPersona(Persona persona) {
		entityManager.persist(persona);
	}
	
	@Override
	public boolean personaExists(String nombre, String tipo_persona) {
		String hql = "FROM Persona as p where p.nombre = ? and p.tipoPersona = ?";
		int count = entityManager.createQuery(hql).setParameter(1, nombre)
		              .setParameter(2, tipo_persona).getResultList().size();
		return count > 0 ? true : false;
	}
	@Override
	public void updatePersona(Persona persona) {
		Persona artcl = getPersonaById(persona.getPersonaId());
		artcl.setNombre(persona.getNombre());
		artcl.setTipoPersona(persona.getTipoPersona());
		entityManager.flush();
	}

	@Override
	public void deletePersona(int personaId) {
		entityManager.remove(getPersonaById(personaId));
	}

}
