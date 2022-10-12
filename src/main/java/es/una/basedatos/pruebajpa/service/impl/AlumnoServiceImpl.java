package es.una.basedatos.pruebajpa.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.una.basedatos.pruebajpa.entity.Alumno;
import es.una.basedatos.pruebajpa.repository.AlumnoRepo;
import es.una.basedatos.pruebajpa.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepo alumnoRepo;
	
	@Override
	public Alumno insertarAlumno(String nombre, Date fecha) {
		Alumno al = new Alumno();
		al.setNombre(nombre);
		al.setFecha(fecha);
		return alumnoRepo.save(al) ;
	}

	@Override
	public List<Alumno> listadoAlumno() {
		
		return alumnoRepo.findAll();
	}

	@Override
	public Alumno obtenerAlumno(int id) {

		return alumnoRepo.findById(id).orElse(null);
	}

	@Override
	public Alumno obtenerAlumno(String nombre) {
		
		return alumnoRepo.findByNombre(nombre).orElse(null)  ;
	}

}
