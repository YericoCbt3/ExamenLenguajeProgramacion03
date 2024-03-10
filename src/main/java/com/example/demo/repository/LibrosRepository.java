package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Libros;

public interface LibrosRepository extends JpaRepository<Libros, Integer>{

}
