package com.proyectoclub.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoclub.app.variables.Asociacion;

public interface AsociacionCrud extends JpaRepository<Asociacion, Integer> {

}
