package com.mac.tienda.arapos.repositorios;

import com.mac.tienda.arapos.modelos.Cliente;
import com.mac.tienda.arapos.repositorios.interfaces.ClienteInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositorio extends GenericoCrudRepositorio<Cliente, Long> {

    @Autowired
    private ClienteInterface interace;

    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return interace;
    }
}
