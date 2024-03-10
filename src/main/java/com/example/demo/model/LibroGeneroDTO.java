package com.example.demo.model;

public class LibroGeneroDTO {

	 private int idGen;
	    private String nombreLibro;
	    private String nombreAutor;
	    private String fechaPublicacion;
	    private String nombreGenero;

	    // Constructor
	    public LibroGeneroDTO(int id, String nombreLibro, String nombreAutor, String fechaPublicacion, String nombreGenero) {
	        this.idGen = id;
	        this.nombreLibro = nombreLibro;
	        this.nombreAutor = nombreAutor;
	        this.fechaPublicacion = fechaPublicacion;
	        this.nombreGenero = nombreGenero;
	    }

	    // Getters y setters
	    public int getId() {
	        return idGen;
	    }

	    public void setId(int id) {
	        this.idGen = id;
	    }

	    public String getNombreLibro() {
	        return nombreLibro;
	    }

	    public void setNombreLibro(String nombreLibro) {
	        this.nombreLibro = nombreLibro;
	    }

	    public String getNombreAutor() {
	        return nombreAutor;
	    }

	    public void setNombreAutor(String nombreAutor) {
	        this.nombreAutor = nombreAutor;
	    }

	    public String getFechaPublicacion() {
	        return fechaPublicacion;
	    }

	    public void setFechaPublicacion(String fechaPublicacion) {
	        this.fechaPublicacion = fechaPublicacion;
	    }

	    public String getNombreGenero() {
	        return nombreGenero;
	    }

	    public void setNombreGenero(String nombreGenero) {
	        this.nombreGenero = nombreGenero;
	    }
	
}
