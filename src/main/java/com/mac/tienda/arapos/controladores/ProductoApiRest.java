package com.mac.tienda.arapos.controladores;

import com.mac.tienda.arapos.modelos.Cliente;
import com.mac.tienda.arapos.modelos.Producto;
import com.mac.tienda.arapos.servicios.ClienteServicio;
import com.mac.tienda.arapos.servicios.GenericoServicio;
import com.mac.tienda.arapos.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin("*")
public class ProductoApiRest extends GenericoApiRest<Producto,Long>{
    @Autowired
    private ProductoServicio servicio;

    @Override
    public GenericoServicio<Producto, Long> getService() {
        return servicio;
    }
}
