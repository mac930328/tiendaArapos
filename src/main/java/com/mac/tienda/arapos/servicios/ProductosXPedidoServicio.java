package com.mac.tienda.arapos.servicios;

import com.mac.tienda.arapos.modelos.ProductosXPedido;
import com.mac.tienda.arapos.repositorios.ProductosXPedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductosXPedidoServicio extends GenericoServicio<ProductosXPedido, Long> {

    @Autowired
    private ProductosXPedidoRepositorio repositorio;

    @Override
    public ProductosXPedidoRepositorio getRepositorio() {
        return repositorio;
    }

    @Override
    public ProductosXPedido guardar(ProductosXPedido objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<ProductosXPedido> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public ProductosXPedido actualizar(ProductosXPedido objeto) {
        if (objeto.getId() != null) {
            Optional<ProductosXPedido> c = obtenerXId(objeto.getId());
            if (!c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        } else {
            return objeto;
        }
    }
}
