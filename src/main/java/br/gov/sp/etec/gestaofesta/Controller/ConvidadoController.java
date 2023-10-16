package br.gov.sp.etec.gestaofesta.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etec.gestaofesta.model.Convidado;
import br.gov.sp.etec.gestaofesta.model.Evento;
import br.gov.sp.etec.gestaofesta.repository.ConvidadoRepository;
import br.gov.sp.etec.gestaofesta.repository.EventoRepository;

@Controller
public class ConvidadoController {
	
  @GetMapping("ola-mundo")
	public String ola() {
		return "olaa";
	}
  
  @Autowired
  ConvidadoRepository repo;
  
  @Autowired
  EventoRepository eventoRepository;
  
  
  
  @GetMapping("cadastro-convidado")
  public ModelAndView convida() {
	  ModelAndView view = new ModelAndView("convidado");
	  List<Evento> eventos = eventoRepository.findAll();
	  view.addObject("eventos", eventos);
	  return view;
	  
  }
  
  @PostMapping("salvar-convidados")
  public ModelAndView salvarConvidado(Convidado con) {
	  
	  repo.save(con);
	
	  List<Convidado> listaconvidados= repo.findAll();
	  
	  
	  ModelAndView view= new ModelAndView("lista-convidado");
	  
      view.addObject("convidados", listaconvidados);
	  
	  return view;
  }
  
  @GetMapping("/excluir/{id}")
  public ModelAndView excluir(@PathVariable Long id) {
	  repo.deleteById(id);
	  
List<Convidado> listaconvidados= repo.findAll();
	  
	  
	  ModelAndView view= new ModelAndView("lista-convidado");
	  
      view.addObject("convidados", listaconvidados);
	  
	  return view;
  }
  
  @GetMapping("/editar/{id}")
  public ModelAndView editar(@PathVariable Long id) {
	  
	  Convidado c = repo.findById(id).get();
	  
	  ModelAndView view= new ModelAndView("editar-convidado");
	  
      view.addObject("convidado", c);

	  return view;
  }
  
}



