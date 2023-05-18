package com.escuela.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//modificamos para que sea nuestros modelos y repositorios 

import com.escuela.modelo.Alumno;
import com.escuela.repositorio.RepositorioAlumno;

@RestController
@RequestMapping("/api")

public class ControladorAlumno {

	@Autowired
	private RepositorioAlumno repository;
	
	@GetMapping("/alumno")
	public List<Alumno> allAlumno(){
		return repository.findAll();
	}
	
	
	@GetMapping("/alumno/{nombre}")
	public List<Alumno> findByName(@PathVariable("nombre") String nombre) {
		return repository.findByNombre(nombre);
	}
	
	@PostMapping("/alumno")
	public Alumno createAlumno(@RequestBody Alumno alumno) {
		return repository.save(alumno);
	}
	
	@PutMapping("/alumno/{id}")
	public Alumno updateAlumno(@PathVariable Long id, @RequestBody Alumno alumno) {
		alumno.setId(id);
		return repository.save(alumno);
	}
	
	@DeleteMapping("/alumno/{id}")
	public void deleteAlumno(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
	

}


