package com.mac.tienda.arapos.repositorios;

import com.mac.tienda.arapos.repositorios.interfaces.GenericoCrudImpl;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class GenericoCrudRepositorio<T, ID extends Serializable> implements GenericoCrudImpl<T, ID> {

    public abstract CrudRepository<T, ID> getDao();

    @Override
    public List<T> obtenerTodos() {
        return (List<T>) getDao().findAll();
    }

    @Override
    public Optional<T> obtenerXId(ID id) {
        return getDao().findById(id);
    }

    @Override
    public T guardar(T objecto) {
        return getDao().save(objecto);
    }

    @Override
    public void eliminar(ID id) {
        getDao().deleteById(id);
    }

}
