package com.prueba.apiprueba.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.apiprueba.models.Category;
import com.prueba.apiprueba.services.ICategoryService;
import com.prueba.apiprueba.services.IProductService;

@RestController
@RequestMapping("/categorias")
public class CategoryController {
    @Autowired
    private ICategoryService service;

    @Autowired
    private IProductService serviceProduct;

    @GetMapping
    public ResponseEntity<?> findCategorias() {
        try {
            List<Category> resp = service.findCategories();

            return ResponseEntity.ok().body(Collections.singletonMap("categorias", resp));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Collections.singletonMap("message", "Error: " + e.getMessage()));
        }
    }
}
