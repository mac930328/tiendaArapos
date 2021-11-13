package com.mac.tienda.arapos.repositorios;

import com.mac.tienda.arapos.modelos.ProductosXPedido;
import com.mac.tienda.arapos.repositorios.interfaces.ProductosXPedidoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductosXPedidoRepositorio extends GenericoCrudRepositorio<ProductosXPedido, Long> {

    @Autowired
    private ProductosXPedidoInterface interace;

    @Override
    public CrudRepository<ProductosXPedido, Long> getDao() {
        return interace;
    }
}
