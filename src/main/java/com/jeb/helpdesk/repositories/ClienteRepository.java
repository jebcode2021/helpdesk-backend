package com.jeb.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeb.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
