package com.prueba.apiprueba.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.apiprueba.models.Product;
import com.prueba.apiprueba.services.IProductService;

@RestController
@RequestMapping("/productos")
public class ProductController {
    @Autowired
    private IProductService service;

    @GetMapping("/{idCategoria}")
    public ResponseEntity<?> findProductsByIdCategoria(@PathVariable("idCategoria") Long idCategoria) {
        try {
            final List<Product> response = service.findProductsByIdCategoria(idCategoria);
            return ResponseEntity.ok().body(Collections.singletonMap("productos", response));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Collections.singletonMap("message", "Error: " + e.getMessage()));
        }
    }
}
