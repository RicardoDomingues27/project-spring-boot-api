package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
	//Gera uma Query automaticamente pelo Spring Boot, pois segue o padrao de nomeclatura
	List<Topico> findByCurso_Nome(String nomeCurso);
	
	//Este exemplo mostra como pode ser feito uma Query diferente do padrao de JPA
//	@Query ("SELECT * FROM TOPICO t WHERE t.curso.nome = :nomeCurso")
//	List<Topico> carregaCursoPorNome(String nomeCurso);
	
	
	
}
