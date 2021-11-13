package com.mac.tienda.arapos.repositorios;

import com.mac.tienda.arapos.modelos.Pedido;
import com.mac.tienda.arapos.repositorios.interfaces.ClienteInterface;
import com.mac.tienda.arapos.repositorios.interfaces.PedidoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoRepositorio extends GenericoCrudRepositorio<Pedido, Long> {

    @Autowired
    private PedidoInterface interace;

    @Override
    public CrudRepository<Pedido, Long> getDao() {
        return interace;
    }
}
