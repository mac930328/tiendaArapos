package com.mac.tienda.arapos.repositorios;

import com.mac.tienda.arapos.modelos.Producto;
import com.mac.tienda.arapos.repositorios.interfaces.ClienteInterface;
import com.mac.tienda.arapos.repositorios.interfaces.ProductoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepositorio extends GenericoCrudRepositorio<Producto, Long> {

    @Autowired
    private ProductoInterface interace;

    @Override
    public CrudRepository<Producto, Long> getDao() {
        return interace;
    }
}
