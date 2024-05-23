package com.proyectoclub.app.variables;

import jakarta.persistence.*;
import java.time.*;

@Entity
@Table(name="competiciones")
public class Competicion {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String nombre;
private int montoPremio;
private LocalDate fechaInicio;
private LocalDate fechaFin;

public Competicion() {
	super();
}
public Competicion(Integer id, String nombre, int montoPremio, LocalDate fechaInicio, LocalDate fechaFin) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.montoPremio = montoPremio;
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
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
public int getMontoPremio() {
	return montoPremio;
}
public void setMontoPremio(int montoPremio) {
	this.montoPremio = montoPremio;
}
public LocalDate getFechaInicio() {
	return fechaInicio;
}
public void setFechaInicio(LocalDate fechaInicio) {
	this.fechaInicio = fechaInicio;
}
public LocalDate getFechaFin() {
	return fechaFin;
}
public void setFechaFin(LocalDate fechaFin) {
	this.fechaFin = fechaFin;
}


}
