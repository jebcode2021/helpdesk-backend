package com.jeb.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeb.helpdesk.domain.Chamado;
import com.jeb.helpdesk.repositories.ChamadoRepository;
import com.jeb.helpdesk.services.exceptions.ObjectnotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = chamadoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! ID: " + id));
	}
}
