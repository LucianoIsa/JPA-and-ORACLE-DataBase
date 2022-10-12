package es.una.basedatos.pruebajpa.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.una.basedatos.pruebajpa.entity.Alumno;
import es.una.basedatos.pruebajpa.service.AlumnoService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/alumno")
@Slf4j
public class Alumnocontroller {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping(value="/add/{nombre}")
	public Alumno insertarAlumnos(@PathVariable String nombre) {
		log.info("Inicio: insertarAlumnos");
		
		Alumno alumno = alumnoService.insertarAlumno(nombre, new Date());
		return  alumno;
	}
	
	@GetMapping(value={"","/"})
	public List<Alumno> listadoAlumnos(){
		log.info("Inicio: listadoAlumnos");
		List<Alumno> alumnos = alumnoService.listadoAlumno();
		return alumnos;
		
	}
	
	@GetMapping("/{id}")
	public Alumno obtenerAlumno(@PathVariable Integer id) {
		log.info("Inicio: obtenerAlumno{}" , id);
		Alumno alumno = alumnoService.obtenerAlumno(id);
		return alumno;
	}
}
