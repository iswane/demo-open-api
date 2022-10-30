package com.example.demoopenapi.services;

import com.example.demoopenapi.entities.Product;
import com.example.demoopenapi.repositories.ProductRepository;
import com.example.demoopenapi.services.dto.ProductDTO;
import com.example.demoopenapi.services.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    public Collection<ProductDTO> allProduct() {
        return StreamSupport.stream(this.productRepository.findAll().spliterator(), false)
                .map(this.mapper::toDto)
                .collect(Collectors.toList());
    }

    public ProductDTO find(Long id) {
        return productRepository.findById(id)
                .map(this.mapper::toDto)
                .orElse(null);
    }
}
