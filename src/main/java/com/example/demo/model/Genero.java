package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "idg", nullable = false)
	public int id;
	
	@Column (name = "nombregenero", nullable = false)
	public String ngenero;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNgenero() {
		return ngenero;
	}

	public void setNgenero(String ngenero) {
		this.ngenero = ngenero;
	}
	
	
}
