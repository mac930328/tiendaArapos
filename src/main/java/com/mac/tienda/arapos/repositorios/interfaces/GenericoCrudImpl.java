package com.mac.tienda.arapos.repositorios.interfaces;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface GenericoCrudImpl<T, ID extends Serializable> {

    public List<T> obtenerTodos();

    public Optional<T> obtenerXId(ID id);

    public T guardar(T objecto);

    public void eliminar(ID id);

}
