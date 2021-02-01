package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// Faz a condução dos dados da tabela ao banco
// Serve para persistir os dados no banco (insert, delete, etc)
// Para fazer os gets, posts, puts, vc precisa persistir
public interface ManutencaoRepository extends JpaRepository<ManutencaoTable, Long> {

}
