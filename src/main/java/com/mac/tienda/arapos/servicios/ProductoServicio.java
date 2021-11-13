package com.mac.tienda.arapos.servicios;

import com.mac.tienda.arapos.modelos.Cliente;
import com.mac.tienda.arapos.modelos.Producto;
import com.mac.tienda.arapos.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoServicio extends GenericoServicio<Producto, Long> {

    @Autowired
    private ProductoRepositorio repositorio;

    @Override
    public ProductoRepositorio getRepositorio() {
        return repositorio;
    }

    @Override
    public Producto guardar(Producto objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Producto> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Producto actualizar(Producto objeto) {
        if (objeto.getId() != null) {
            Optional<Producto> c = obtenerXId(objeto.getId());
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
