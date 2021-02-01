package org.generation.blogPessoal.repository;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

	//METODO PARA ENCONTRAR O LOGIN DO USUARIO
	Usuario findByLogin(String login);
	
}
