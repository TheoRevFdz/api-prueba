package com.prueba.apiprueba.services;

import java.util.List;

import com.prueba.apiprueba.models.Category;

public interface ICategoryService {
    public List<Category> findCategories();
}
