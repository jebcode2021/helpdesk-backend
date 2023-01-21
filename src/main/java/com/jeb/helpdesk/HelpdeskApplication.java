package com.jeb.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jeb.helpdesk.domain.Chamado;
import com.jeb.helpdesk.domain.Cliente;
import com.jeb.helpdesk.domain.Tecnico;
import com.jeb.helpdesk.domain.enums.Perfil;
import com.jeb.helpdesk.domain.enums.Prioridade;
import com.jeb.helpdesk.domain.enums.Status;
import com.jeb.helpdesk.repositories.ChamadoRepository;
import com.jeb.helpdesk.repositories.ClienteRepository;
import com.jeb.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired 
	private ClienteRepository clienteRepository;
	
	@Autowired 
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tecnico1 = new Tecnico(null, "Jonathan E Boza", "06242593904", "jebcode@outlook.com.br", "123");
		tecnico1.addPerfils(Perfil.ADMIN);
		
		Cliente cliente1 = new Cliente(null, "Denise M Boza", "1055736988", "denisemachadoboza", "123");
		
		Chamado chamado1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tecnico1, cliente1);
		
		tecnicoRepository.saveAll(Arrays.asList(tecnico1));
		clienteRepository.saveAll(Arrays.asList(cliente1));
		chamadoRepository.saveAll(Arrays.asList(chamado1));
		
	}

}
