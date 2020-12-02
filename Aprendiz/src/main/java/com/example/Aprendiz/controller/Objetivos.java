package com.example.Aprendiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")

public class Objetivos {

	@GetMapping
public String home() {

	return "Utilizei a persistencia e atencao aos detalhes";
	

}
	}
