package com.example.simplerestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {
	@GetMapping
	public String sayHello() {
		return "hey, this is my first program";
	}
	

}
