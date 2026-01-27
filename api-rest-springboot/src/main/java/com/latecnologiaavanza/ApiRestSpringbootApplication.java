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

	@GetMapping("/saludos")
	public String saludar2() {
		return "Hola desde Spring Boot de nuevo";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringbootApplication.class, args);
	}

}
