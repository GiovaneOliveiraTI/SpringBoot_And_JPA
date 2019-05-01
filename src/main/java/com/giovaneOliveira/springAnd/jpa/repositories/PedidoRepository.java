package com.giovaneOliveira.springAnd.jpa.repositories;

import com.giovaneOliveira.springAnd.jpa.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
