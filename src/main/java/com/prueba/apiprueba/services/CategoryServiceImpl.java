package com.prueba.apiprueba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.apiprueba.models.Category;
import com.prueba.apiprueba.repositories.ICategoryRepository;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository repository;

    @Override
    public List<Category> findCategories() {
        return repository.findAll();
    }

}
