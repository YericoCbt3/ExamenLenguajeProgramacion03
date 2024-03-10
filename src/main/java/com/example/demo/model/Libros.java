package com.example.demo.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id", nullable = false)
	public int idL;
	
	@Column (name = "nombrelibro", nullable = false)
	public String nombreL;
	
	@Column (name = "nombreautor", nullable = false)
	public String nombreautorL;
	
	@Column (name = "fechapublicacion", nullable = false)
	public String fecha;
	
	@ManyToOne
	@JoinColumn(name = "generoid", nullable = false)
	public Genero genero;

	public int getIdL() {
		return idL;
	}

	public void setIdL(int idL) {
		this.idL = idL;
	}

	public String getNombreL() {
		return nombreL;
	}

	public void setNombreL(String nombreL) {
		this.nombreL = nombreL;
	}

	public String getNombreautorL() {
		return nombreautorL;
	}

	public void setNombreautorL(String nombreautorL) {
		this.nombreautorL = nombreautorL;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
	
}
