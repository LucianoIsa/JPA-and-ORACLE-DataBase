package es.una.basedatos.pruebajpa.service;

import java.util.Date;
import java.util.List;

import es.una.basedatos.pruebajpa.entity.Alumno;

public interface AlumnoService {
	public Alumno insertarAlumno(String nombre, Date fecha);
	public List<Alumno> listadoAlumno();
	public Alumno obtenerAlumno(int id);
	public Alumno obtenerAlumno(String nombre);
	

}
