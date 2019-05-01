package com.giovaneOliveira.springAnd.jpa.services;

import com.giovaneOliveira.springAnd.jpa.model.Pedido;
import com.giovaneOliveira.springAnd.jpa.repositories.PedidoRepository;
import com.giovaneOliveira.springAnd.jpa.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Obj eto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }

}