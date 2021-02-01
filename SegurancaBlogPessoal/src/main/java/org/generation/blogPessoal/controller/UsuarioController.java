package org.generation.blogPessoal.controller;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//CONTROLA TODOS OS ENDPOINTs, OU SEJA, ELE É QUE CRIA O HTTP DO SERVICE COM O REPOSITORY
@RestController
public class UsuarioController {

	@Autowired
	private Service UsuarioService;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(UsuarioService.CadastrarUsuario(usuario));
	}
}
