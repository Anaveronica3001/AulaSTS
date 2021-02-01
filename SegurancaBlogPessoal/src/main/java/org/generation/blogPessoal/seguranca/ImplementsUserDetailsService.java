package org.generation.blogPessoal.seguranca;

import javax.transaction.Transactional;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class ImplementsUserDetailsService implements UserDetailsService{//

	//INJETA O REPOSITORY
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//VERIFICA APARTIR DO  username INFORMADO E SE ELE NAO EXISTIR INFORMA AO USUARIO QUE NAO FOI ENCONTARDO
	//E CASO ELE EXISTE CONCEDE TODAS AS PERMISSOES DE ADMIN
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByLogin(login);
		
		if(usuario == null){
			throw new UsernameNotFoundException("Usuario(a) não encontrado(a)!");
		}
		return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities());
	}

}
