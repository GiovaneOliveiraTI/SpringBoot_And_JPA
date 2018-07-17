package com.giovaneOliveira.springAnd.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giovaneOliveira.springAnd.jpa.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
	

}
