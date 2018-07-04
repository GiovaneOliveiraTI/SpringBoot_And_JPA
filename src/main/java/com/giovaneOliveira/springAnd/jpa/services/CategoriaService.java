package com.giovaneOliveira.springAnd.jpa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovaneOliveira.springAnd.jpa.model.Categoria;
import com.giovaneOliveira.springAnd.jpa.repositories.CategoriaRepository;
import com.giovaneOliveira.springAnd.jpa.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public Categoria Buscar(Long id) {
		Optional<Categoria> categoria  = categoriaRepository.findById(id);
		return categoria.orElseThrow (() -> new ObjectNotFoundException("Objeto categoria não encontrada! id " + id + " Tipo " + Categoria.class.getName()));
	}

}
