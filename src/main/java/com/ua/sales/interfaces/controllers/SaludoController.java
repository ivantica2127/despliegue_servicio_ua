package com.ua.sales.interfaces.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/saludo")
public class SaludoController {

	
	@GetMapping
	public String saludar() {
		
		return "Bienvenido al curso de cloud computing en la UA!";
		
	}
	
	
}
