package com.mac.tienda.arapos.controladores;

import com.mac.tienda.arapos.modelos.ProductosXPedido;
import com.mac.tienda.arapos.servicios.GenericoServicio;
import com.mac.tienda.arapos.servicios.ProductosXPedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productos-x-pedido")
@CrossOrigin("*")
public class ProductosXPedidoApiRest extends GenericoApiRest<ProductosXPedido, Long> {
    @Autowired
    private ProductosXPedidoServicio servicio;

    @Override
    public GenericoServicio<ProductosXPedido, Long> getService() {
        return servicio;
    }
}
