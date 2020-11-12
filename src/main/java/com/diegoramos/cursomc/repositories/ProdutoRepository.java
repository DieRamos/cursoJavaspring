package com.diegoramos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegoramos.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
}
