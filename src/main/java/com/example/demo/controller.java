package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/")
	public String printHelloWorld() { 
		return "Hello World";
	}
	
}
