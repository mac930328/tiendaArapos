package com.mac.tienda.arapos.repositorios.interfaces;

import com.mac.tienda.arapos.modelos.Cliente;
import com.mac.tienda.arapos.modelos.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoInterface extends CrudRepository<Pedido, Long> {
}
