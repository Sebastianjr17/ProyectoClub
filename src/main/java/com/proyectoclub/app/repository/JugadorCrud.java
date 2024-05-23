package com.proyectoclub.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoclub.app.variables.Jugador;

public interface JugadorCrud extends JpaRepository<Jugador, Integer>{

}