package com.mac.tienda.arapos.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    private Integer cantidad;

    @OneToMany(mappedBy = "producto",cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"producto","pedido"})
    private List<ProductosXPedido> productosXPedido;
}
