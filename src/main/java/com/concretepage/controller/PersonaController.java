package com.concretepage.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.concretepage.entity.Persona;
import com.concretepage.service.IPersonaService;

@Controller
@RequestMapping("administrador")
public class PersonaController {

	@Autowired
	private IPersonaService personaService;
	@GetMapping("medicos")
	public ResponseEntity<List<Persona>> getAllPersona() {
		List<Persona> list = personaService.getAllPersona();
		return new ResponseEntity<List<Persona>>(list, HttpStatus.OK);
	}
	@GetMapping("pacientes")
	public ResponseEntity<List<Persona>> getAllPacientes() {
		List<Persona> list = personaService.getAllPacientes();
		return new ResponseEntity<List<Persona>>(list, HttpStatus.OK);
	}
	@PostMapping("medico")
	public ResponseEntity<Void> addPersona(@RequestBody Persona persona, UriComponentsBuilder builder) {
        boolean flag = personaService.addPersona(persona);
        if (flag == false) {
        	return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/medico/{id}").buildAndExpand(persona.getPersonaId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping("medico/{id}")
	public ResponseEntity<Persona> getPersonaById(@PathVariable("id") Integer id) {
		Persona persona = personaService.getPersonaById(id);
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}
	@PutMapping("medico")
	public ResponseEntity<Persona> updatePersona(@RequestBody Persona persona) {
		personaService.updatePersona(persona);
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}
	@DeleteMapping("medico/{id}")
	public ResponseEntity<Void> deletePersona(@PathVariable("id") Integer id) {
		personaService.deletePersona(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	
}
