package com.giovaneOliveira.springAnd.jpa.repositories;

import com.giovaneOliveira.springAnd.jpa.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
