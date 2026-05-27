package com.example.question_7.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.question_7.model.Product;

public interface ProductRepository
        extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.price < :price AND p.category = :category")
    List<Product> findProductsByPriceAndCategory(
            @Param("price") double price,
            @Param("category") String category);

}
