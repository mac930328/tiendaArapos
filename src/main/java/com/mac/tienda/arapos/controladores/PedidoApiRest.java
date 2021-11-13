package com.mac.tienda.arapos.controladores;

import com.mac.tienda.arapos.modelos.Cliente;
import com.mac.tienda.arapos.modelos.Pedido;
import com.mac.tienda.arapos.servicios.ClienteServicio;
import com.mac.tienda.arapos.servicios.GenericoServicio;
import com.mac.tienda.arapos.servicios.PedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedido")
@CrossOrigin("*")
public class PedidoApiRest extends GenericoApiRest<Pedido,Long>{
    @Autowired
    private PedidoServicio servicio;

    @Override
    public GenericoServicio<Pedido, Long> getService() {
        return servicio;
    }
}
