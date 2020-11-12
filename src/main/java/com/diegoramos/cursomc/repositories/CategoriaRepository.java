package com.diegoramos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegoramos.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
}
	