package com.prueba.apiprueba.services;

import java.util.List;

import com.prueba.apiprueba.models.Product;

public interface IProductService {
    public List<Product> findProductsByIdCategoria(Long idCategoria);
}
