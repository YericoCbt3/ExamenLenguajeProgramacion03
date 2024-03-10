package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Genero;
import com.example.demo.repository.GeneroRepository;

@Service
public class GeneroService {
	
	@Autowired
	private GeneroRepository generorepository;
	
	public List<Genero> getAllGenero(){
		return generorepository.findAll();
	}
	
	public Genero getGeneroById(int id) {
		return generorepository.findById(id).orElse(null);
	}
}
