package com.mac.tienda.arapos.servicios;

import com.mac.tienda.arapos.repositorios.GenericoCrudRepositorio;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class GenericoServicio<T, ID extends Serializable> {

    public abstract GenericoCrudRepositorio<T, ID> getRepositorio();

    public abstract T guardar(T objeto);

    public abstract T actualizar(T objeto);

    public List<T> obtenerTodos() {
        return getRepositorio().obtenerTodos();
    }

    public Optional<T> obtenerXId(ID id) {
        return getRepositorio().obtenerXId(id);
    }

    public boolean eliminar(ID id) {
        return getRepositorio().obtenerXId(id).map(t -> {
            getRepositorio().eliminar(id);
            return true;
        }).orElse(false);
    }
}
