package com.proyectoclub.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoclub.app.variables.Entrenador;

public interface EntrenadorCrud extends JpaRepository<Entrenador, Integer> {

}
