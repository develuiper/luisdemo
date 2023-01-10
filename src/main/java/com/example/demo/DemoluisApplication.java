package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoluisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoluisApplication.class, args);
		System.out.println("Hola luis"); 
	}
	@GetMapping("/hola")
	public String hola() {
		return "estamos en la nubexx"; 		
	}
}
