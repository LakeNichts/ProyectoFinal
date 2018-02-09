package com.concretepage.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.concretepage.entity.Persona;
import com.concretepage.service.IPersonaService;

@Controller
@RequestMapping("administrador")
public class PersonaController {

	@Autowired
	private IPersonaService personaService;
	@GetMapping("personas")
	public ResponseEntity<List<Persona>> getAllPersona() {
		List<Persona> list = personaService.getAllPersona();
		return new ResponseEntity<List<Persona>>(list, HttpStatus.OK);
	}
	@GetMapping("pacientes")
	public ResponseEntity<List<Persona>> getAllPacientes() {
		List<Persona> list = personaService.getAllPacientes();
		return new ResponseEntity<List<Persona>>(list, HttpStatus.OK);
	}/*
	@GetMapping("paciente")
	public ResponseEntity<List<Persona>> getAllPacientes2() {
		List<Persona> list = personaService.getAllPacientes2();
		return new ResponseEntity<List<Persona>>(list, HttpStatus.OK);
	}*/
}
