package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Genero;
import com.example.demo.model.Libros;
import com.example.demo.service.GeneroService;
import com.example.demo.service.LibrosService;

@Controller
@RequestMapping("/libros")
public class LibrosControler {
	
	@Autowired
	private GeneroService generoservice;
	@Autowired
	private LibrosService librosservice;
	
	@GetMapping("/getAllLibros")
	public String getAllLibros(Model model) {
		
		List<Libros> listLibros = librosservice.getAllLibros();
		model.addAttribute("libros", listLibros);	
		return "LibrosList";
	}
	
	
	@GetMapping("/register")
	public String registerSabor(Model model) {
		model.addAttribute("genero", generoservice.getAllGenero());
		return "LibrosRegistro";
	}
	
	
	@PostMapping ("/register")
	public String createLibros(@RequestParam("nombreL")String nombreL ,
			@RequestParam("nombreautorL")String nombreautorL, 
			@RequestParam("fecha") String fecha, 
			@RequestParam("generoid")int id, Model model ) { 
		
		Libros libros = new Libros();
		
		libros.nombreL = nombreL;
		libros.nombreautorL = nombreautorL;
		libros.fecha = fecha;
		
		Genero genero = generoservice.getGeneroById(id);
		libros.genero = genero;
		
		librosservice.createLibros(libros);
		
		
		model.addAttribute("genero", generoservice.getAllGenero());
		model.addAttribute("libros", librosservice.getAllLibros());

		
		return"LibrosList";
	}
	
}
