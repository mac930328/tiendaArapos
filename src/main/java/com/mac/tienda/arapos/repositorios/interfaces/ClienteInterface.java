package com.mac.tienda.arapos.repositorios.interfaces;

import com.mac.tienda.arapos.modelos.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface ClienteInterface extends CrudRepository<Cliente, Long> {

}
