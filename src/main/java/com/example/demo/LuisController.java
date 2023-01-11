package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuisController {
	@GetMapping("/check")
	public String hola() {
		return "estamos en la nubexx"; 		
	}
	
	@GetMapping("/")
	public String ola() {
		return "estamos en la nubexx"; 		
	}
}
