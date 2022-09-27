package com.prueba.apiprueba.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.apiprueba.models.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
    // public List<Product> findProductsByIdCategoria(Long idCategoria);
    @Query(value = "SELECT * FROM productos p WHERE p.idCategoria = ?", nativeQuery = true)
    public List<Product> findByIdCategoria(Long IdCategoria);
}
