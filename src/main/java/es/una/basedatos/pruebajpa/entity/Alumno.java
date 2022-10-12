package es.una.basedatos.pruebajpa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Alumno")
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="alumno_id")
	@Getter @Setter
	private int id;
	
	@Column(name="nombre")
	@Getter @Setter
	private String nombre;
	
	@Column(name="fecha_nacimiento")
	@Getter @Setter
	@Temporal(TemporalType.DATE)
	private Date fecha;

}
