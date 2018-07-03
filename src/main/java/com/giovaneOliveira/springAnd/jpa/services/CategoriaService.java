package com.giovaneOliveira.springAnd.jpa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovaneOliveira.springAnd.jpa.domain.Categoria;
import com.giovaneOliveira.springAnd.jpa.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public Categoria Buscar(Long id) {
		Optional<Categoria> categoria  = categoriaRepository.findById(id);
		return categoria.orElse(null);
	}

}
