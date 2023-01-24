package com.jeb.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeb.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
