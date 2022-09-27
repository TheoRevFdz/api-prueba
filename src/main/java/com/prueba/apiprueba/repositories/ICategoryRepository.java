package com.prueba.apiprueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.apiprueba.models.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
