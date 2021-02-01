package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.PostagemModel;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
	//INJETA O repository
	@Autowired
	private PostagemRepository repository;
	
	//MOSTRA TODOS AS POSTAGENS FEITAS
	@GetMapping
	public ResponseEntity<List<PostagemModel>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	 //MOSTRA APENAS A POSTAGEM SELECIONADA POR ID
	@GetMapping("/findById/{id}")
	public ResponseEntity<PostagemModel> FindById(@PathVariable Long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	//MOSTRA APENAS A POSTAGEM SELECIONADA POR TITULO
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<PostagemModel>> GetByIdTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	//ESCREVER POSTAGEM
	@PostMapping
	public ResponseEntity<PostagemModel> post(@RequestBody PostagemModel postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	//ATUALIZAR POSTAGEM
	@PutMapping
	public ResponseEntity<PostagemModel> put(@RequestBody PostagemModel postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	//DELETAR POSTAGEM
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
