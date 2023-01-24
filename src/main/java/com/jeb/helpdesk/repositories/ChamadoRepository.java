package com.jeb.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeb.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
