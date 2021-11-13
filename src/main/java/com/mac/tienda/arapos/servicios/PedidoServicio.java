package com.mac.tienda.arapos.servicios;

import com.mac.tienda.arapos.modelos.Cliente;
import com.mac.tienda.arapos.modelos.Pedido;
import com.mac.tienda.arapos.repositorios.ClienteRepositorio;
import com.mac.tienda.arapos.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoServicio extends GenericoServicio<Pedido, Long>{

    @Autowired
    private PedidoRepositorio repositorio;

    @Override
    public PedidoRepositorio getRepositorio() {
        return repositorio;
    }

    @Override
    public Pedido guardar(Pedido objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Pedido> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Pedido actualizar(Pedido objeto) {
        if (objeto.getId() != null) {
            Optional<Pedido> c = obtenerXId(objeto.getId());
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
