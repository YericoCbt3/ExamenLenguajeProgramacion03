package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Libros;
import com.example.demo.repository.LibrosRepository;

@Service
public class LibrosService {

	@Autowired
	private LibrosRepository librosrepository;
	
	public List<Libros> getAllLibros(){
		return librosrepository.findAll();
	}
	
	public Libros createLibros(Libros libros) {
		return librosrepository.save(libros);
	}
	
	public void deletLibros(int idL) {
		librosrepository.deleteById(idL);
	}
	
	public Libros getLibrosById(int idL) {
		return librosrepository.findById(idL).orElse(null);
	}
	
}
