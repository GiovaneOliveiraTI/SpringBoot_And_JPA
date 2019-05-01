package com.giovaneOliveira.springAnd.jpa.repositories;

import com.giovaneOliveira.springAnd.jpa.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
