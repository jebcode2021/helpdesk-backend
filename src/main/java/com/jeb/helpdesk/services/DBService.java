package com.jeb.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeb.helpdesk.domain.Chamado;
import com.jeb.helpdesk.domain.Cliente;
import com.jeb.helpdesk.domain.Tecnico;
import com.jeb.helpdesk.domain.enums.Perfil;
import com.jeb.helpdesk.domain.enums.Prioridade;
import com.jeb.helpdesk.domain.enums.Status;
import com.jeb.helpdesk.repositories.ChamadoRepository;
import com.jeb.helpdesk.repositories.PessoaRepository;

@Service
public class DBService {

	@Autowired 
	private ChamadoRepository chamadoRepository;
	
	@Autowired 
	private PessoaRepository pessoaRepository;
	
	public void instanciaDB() {
		
		Tecnico tecnico1 = new Tecnico(null, "Jonathan E Boza", "06242593904", "jebcode@outlook.com.br", "123");
		tecnico1.addPerfils(Perfil.ADMIN);
		Tecnico tecnico2 = new Tecnico(null, "Denise M Boza", "06242593904", "denisemachadoboza@outlook.com.br", "123");
		Tecnico tecnico3 = new Tecnico(null, "Richard E Martins", "06242593904", "richard@outlook.com.br", "123");
		Tecnico tecnico4 = new Tecnico(null, "Natália Euzébio Martins", "06242593904", "natalia@outlook.com.br", "123");
		Tecnico tecnico5 = new Tecnico(null, "Moacir Euzébio Martins", "06242593904", "natalia@outlook.com.br", "123");

		Cliente cliente1 = new Cliente(null, "Denise M Boza", "1055736988", "denisemachadoboza@outlook.com.br", "123");
		Cliente cliente2 = new Cliente(null, "Marlete M Boza", "1055736988", "marlete@outlook.com.br", "123");
		Cliente cliente3 = new Cliente(null, "Marino M Boza", "1055736988", "marino@outlook.com.br", "123");
		Cliente cliente4 = new Cliente(null, "Giovani M Boza", "1055736988", "giovani@outlook.com.br", "123");
		Cliente cliente5 = new Cliente(null, "Juarez M Boza", "1055736988", "juarez@outlook.com.br", "123");

		Chamado chamado1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tecnico1, cliente1);
		Chamado chamado2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 02", "Segundo chamado", tecnico1, cliente2);
		Chamado chamado3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 03", "Terceiro chamado", tecnico2, cliente3);
		Chamado chamado4 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 04", "Quatro chamado", tecnico3, cliente3);
		Chamado chamado5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 05", "Cinco chamado", tecnico2, cliente1);
		Chamado chamado6 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 06", "Seis chamado", tecnico1, cliente5);

		pessoaRepository.saveAll(Arrays.asList(tecnico1, tecnico2, tecnico3, tecnico4, tecnico5, cliente1, cliente2, cliente3, cliente4, cliente5));
		chamadoRepository.saveAll(Arrays.asList(chamado1, chamado2, chamado3, chamado4, chamado5, chamado6));
	}
}
