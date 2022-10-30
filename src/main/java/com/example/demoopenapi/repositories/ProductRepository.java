package com.example.demoopenapi.repositories;

import com.example.demoopenapi.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}