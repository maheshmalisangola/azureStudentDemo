package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	
	@GetMapping("/student")
	public String getStudent() {
		return "welcome to azure Praddyman...... and sagar........";
	}
}
