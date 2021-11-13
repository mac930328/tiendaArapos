package com.mac.tienda.arapos.controladores;

import com.mac.tienda.arapos.modelos.Cliente;
import com.mac.tienda.arapos.servicios.ClienteServicio;
import com.mac.tienda.arapos.servicios.GenericoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin("*")
public class ClienteApiRest extends GenericoApiRest<Cliente,Long>{

    @Autowired
    private ClienteServicio servicio;

    @Override
    public GenericoServicio<Cliente, Long> getService() {
        return servicio;
    }
}
