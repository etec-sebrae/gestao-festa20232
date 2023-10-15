package br.gov.sp.etec.gestaofesta.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.gov.sp.etec.gestaofesta.model.Evento;
import br.gov.sp.etec.gestaofesta.repository.EventoRepository;

@Controller
public class EventoController {
 
	@Autowired
	EventoRepository repository;
	
	
	@GetMapping ("cadastrar-evento")
	public String formEvento() {
		return "form-evento";
	}//formEvento
	
	@PostMapping("salvar-evento")
	public String salvarEvento(Evento evento) {
		repository.save(evento);
		return "form-evento";
	}
	
}
