package br.gov.sp.etec.gestaofesta.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etec.gestaofesta.model.Convidado;
import br.gov.sp.etec.gestaofesta.model.Evento;
import br.gov.sp.etec.gestaofesta.model.Logiin;
import br.gov.sp.etec.gestaofesta.repository.ConvidadoRepository;
import br.gov.sp.etec.gestaofesta.repository.EventoRepository;
import br.gov.sp.etec.gestaofesta.repository.LoginRepository;

@Controller
public class LoggiinController {
	  @Autowired
	  ConvidadoRepository repo;
	  
	  @Autowired
	  EventoRepository eventoRepository;
	
	  @Autowired
	  LoginRepository loginRepository;
	
     @GetMapping("/")
	  public String abrirLogin() {
		  return "loggiin";
		  
		  
	  }
     
    @PostMapping("/logar")
    	 public ModelAndView logarSistema(Logiin loginEntrada){
    	
    	Logiin loginRetorno = loginRepository.findByEmail(loginEntrada.getEmail());
    	
    	if(loginEntrada.getEmail().equals(loginRetorno.getEmail())&& loginEntrada.getSenha().equals(loginRetorno.getSenha())) 
    	   {
    		
    		List<Evento> lista = eventoRepository.findAll();
    		
    		ModelAndView view = new ModelAndView("lista-evento");
    		view.addObject("eventos",lista);
    		
    		
    	      return view;
    	      
    	    } else {
    	    	
    	      ModelAndView view = new ModelAndView("loggiin");	
    	      return view;
    	      
    	   }
     }
    
    @GetMapping("/cadastrar")
       public String cadastrar(){
    	   return "cadastro-login";

       }
    
    @PostMapping("/efetivar")
    public String efetivar(Logiin login) {

    	loginRepository.save(login);
    	
    	return "loggiin";
    }
}
