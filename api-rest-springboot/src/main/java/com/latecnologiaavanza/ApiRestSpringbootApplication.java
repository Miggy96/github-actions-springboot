package com.latecnologiaavanza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiRestSpringbootApplication {

	@GetMapping("/saludar")
	public String saludar() {
		return "Hola desde Spring Boot";
	}

	@GetMapping("/saludar2")
	public String saludar2() {
		return "Hola desde Spring Boot de nuevo";
	}

	@GetMapping("/saludarNuevo")
	public String saludarNuevo() {
		return "Hola desde Spring Boot de nuevo !!";
	}

	@GetMapping("/saludarTodos")
	public String saludaraTodos() {
		return "Hola desde Spring Boot de nuevo, los saludo a todos !!";
	}

	@GetMapping("/saludo")
	public String salud() {
		return "Hola desde Spring Boot de nuevo, los saludo a todos !!";
	}


	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringbootApplication.class, args);
	}

}
