package com.proyectoclub.app.variables;

import jakarta.persistence.*;

@Entity
@Table(name = "asociaciones")
public class Asociacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String pais;
	private String presidente;

	public Asociacion() {
		super();
	}

	public Asociacion(Integer id, String nombre, String pais, String presidente) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.presidente = presidente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPresidente() {
		return presidente;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

}
