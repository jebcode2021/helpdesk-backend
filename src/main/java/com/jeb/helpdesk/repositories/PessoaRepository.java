package com.jeb.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeb.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
