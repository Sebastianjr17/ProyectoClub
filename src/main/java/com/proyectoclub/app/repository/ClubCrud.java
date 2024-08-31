package com.proyectoclub.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoclub.app.variables.Club;

public interface ClubCrud extends JpaRepository<Club, Integer> {

}
