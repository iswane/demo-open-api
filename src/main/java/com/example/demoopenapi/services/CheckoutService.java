package com.example.demoopenapi.services;

import com.example.demoopenapi.repositories.CheckoutRepository;
import com.example.demoopenapi.services.dto.CheckoutDTO;
import com.example.demoopenapi.services.mapper.CheckoutMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class CheckoutService {
    private final CheckoutRepository productRepository;
    private final CheckoutMapper mapper;

    public Collection<CheckoutDTO> all() {
        return StreamSupport.stream(this.productRepository.findAll().spliterator(), false)
                .map(this.mapper::toDto)
                .collect(Collectors.toList());
    }

    public CheckoutDTO find(Long id) {
        return productRepository.findById(id)
                .map(this.mapper::toDto)
                .orElse(null);
    }
}
