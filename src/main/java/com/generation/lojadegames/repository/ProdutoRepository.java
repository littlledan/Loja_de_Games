package com.generation.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.lojadegames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	List<Produto> findAllBynomeContainingIgnoreCase(@Param("nome") String nome);
	
	List<Produto> findAllByconsoleContainingIgnoreCase(@Param("console") String console);
	
	

}
