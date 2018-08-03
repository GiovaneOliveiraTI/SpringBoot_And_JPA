package com.giovaneOliveira.springAnd.jpa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovaneOliveira.springAnd.jpa.model.Cliente;
import com.giovaneOliveira.springAnd.jpa.repositories.ClienteRepository;
import com.giovaneOliveira.springAnd.jpa.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public Cliente Buscar(Long id) {
		Optional<Cliente> cliente  = clienteRepository.findById(id);
		return cliente.orElseThrow (() -> new ObjectNotFoundException(
				"Objeto Cliente não encontrada! id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
