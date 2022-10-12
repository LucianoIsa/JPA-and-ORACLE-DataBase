package es.una.basedatos.pruebajpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplication {
	
	@RequestMapping("/")
	String home() {
		return "Hola Mundo del JPA";
	}
}
