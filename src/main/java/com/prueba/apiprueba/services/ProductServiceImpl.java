package com.prueba.apiprueba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.apiprueba.models.Product;
import com.prueba.apiprueba.repositories.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository repository;

    @Override
    public List<Product> findProductsByIdCategoria(Long idCategoria) {
        return repository.findByIdCategoria(idCategoria);
    }

}
