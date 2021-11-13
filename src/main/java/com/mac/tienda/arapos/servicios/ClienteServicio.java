package com.mac.tienda.arapos.servicios;

import com.mac.tienda.arapos.modelos.Cliente;
import com.mac.tienda.arapos.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServicio extends GenericoServicio<Cliente, Long> {

    @Autowired
    private ClienteRepositorio repositorio;

    @Override
    public ClienteRepositorio getRepositorio() {
        return repositorio;
    }

    @Override
    public Cliente guardar(Cliente objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Cliente> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Cliente actualizar(Cliente objeto) {
        if (objeto.getId() != null) {
            Optional<Cliente> c = obtenerXId(objeto.getId());
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
