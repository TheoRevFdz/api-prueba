package com.prueba.apiprueba.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "productos")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdProducto", unique = true, nullable = false)
    private Long IdProducto;
    @Column(name = "NombreProducto")
    private String NombreProducto;
    @OneToOne
    @JoinColumn(name = "IdProveedor")
    private Proveedor proveedor;
    @Column(name = "IdCategoria")
    private Long IdCategoria;
    @Column(name = "CantidadPorUnidad")
    private String CantidadPorUnidad;
    @Column(name = "PrecioUnitario")
    private Double PrecioUnitario;
    @Column(name = "UnidadesEnStock")
    private Long UnidadesEnStock;
    @Column(name = "UnidadesEnPedido")
    private Long UnidadesEnPedido;
    @Column(name = "NivelReorden")
    private Long NivelReorden;
    @Column(name = "Descontinuado")
    private String Descontinuado;
}
