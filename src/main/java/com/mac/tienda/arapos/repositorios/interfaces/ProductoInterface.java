package com.mac.tienda.arapos.repositorios.interfaces;

import com.mac.tienda.arapos.modelos.Cliente;
import com.mac.tienda.arapos.modelos.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoInterface extends CrudRepository<Producto, Long> {
}
