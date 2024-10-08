package com.proyectoclub.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyectoclub.app.variables.Club;

public interface ClubCrud extends JpaRepository<Club, Integer> {
    @Query("SELECT c FROM Club c LEFT JOIN FETCH c.competiciones")
    List<Club> findAllWithCompeticiones();
}
