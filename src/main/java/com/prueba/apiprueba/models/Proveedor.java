package com.prueba.apiprueba.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "proveedores")
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdProveedor", unique = true, nullable = false)
    private Long IdProveedor;
    @Column(name = "NombreCompania")
    private String NombreCompania;
    @Column(name = "NombreContacto")
    private String NombreContacto;
    @Column(name = "CargoContacto")
    private String CargoContacto;
    @Column(name = "Direccion")
    private String Direccion;
    @Column(name = "Ciudad")
    private String Ciudad;
    @Column(name = "Region")
    private String Region;
    @Column(name = "CodigoPostal")
    private String CodigoPostal;
    @Column(name = "Pais")
    private String Pais;
    @Column(name = "Telefono")
    private String Telefono;
    @Column(name = "Fax")
    private String Fax;
    @Column(name = "HomePage")
    private String HomePage;
}
