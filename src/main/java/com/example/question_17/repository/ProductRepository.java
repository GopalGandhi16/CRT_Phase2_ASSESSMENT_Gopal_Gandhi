package com.example.question_17.repository;

import java.util.Optional;

import com.example.question_17.model.Product;

public interface ProductRepository {

    Optional<Product> findById(Long id);
}