package com.giovaneOliveira.springAnd.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giovaneOliveira.springAnd.jpa.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	

}
