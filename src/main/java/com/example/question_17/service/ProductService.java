package com.example.question_17.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.question_17.model.Product;
import com.example.question_17.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public Product getById(Long id) {

        return repo.findById(id).orElseThrow();
    }
}