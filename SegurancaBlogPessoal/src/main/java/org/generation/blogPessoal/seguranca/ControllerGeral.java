package org.generation.blogPessoal.seguranca;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerGeral {

	// INJETA O REPOSITORIO
	@Autowired
	public TemaRepository repository;
	
	//RESPONSAVEL POR DIRECIONAR O USUARIO PARA O index
	@GetMapping(value="/")
	public String login() {
		return "index";
	}
	
	//RESPONSAVEL POR DIRECIONAR O USUARIO PARA A PAGINA formTema
	@GetMapping(value="/cadastrarTema")
	public String form() {
		return "formTema";
	}
	 //CADASTRA O TEMA NA TABELA_TEMA E DEPOIS REDIRECIONA O USUARIO PARA UM NOVO CADASTRO DE TEMA
	@PostMapping(value="/cadastrarTema")
	public String form(Tema tema) {
		repository.save(tema);
		return "redirect:/cadastrarTema";
	}
	
}
