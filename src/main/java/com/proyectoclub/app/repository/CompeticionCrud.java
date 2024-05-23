package com.proyectoclub.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoclub.app.variables.Competicion;

public interface CompeticionCrud extends JpaRepository<Competicion, Integer>{

}
