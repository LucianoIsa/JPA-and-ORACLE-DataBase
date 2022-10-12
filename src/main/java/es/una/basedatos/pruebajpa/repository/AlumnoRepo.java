package es.una.basedatos.pruebajpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.una.basedatos.pruebajpa.entity.Alumno;

public interface AlumnoRepo extends JpaRepository<Alumno, Integer> {
	public Optional<Alumno> findByNombre(String nombre);

}
