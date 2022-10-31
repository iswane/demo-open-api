package com.example.demoopenapi.services;

import com.example.demoopenapi.repositories.CustomerRepository;
import com.example.demoopenapi.services.dto.CustomerDTO;
import com.example.demoopenapi.services.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper mapper;

    public Collection<CustomerDTO> all() {
        return StreamSupport.stream(this.customerRepository.findAll().spliterator(), false)
                .map(this.mapper::toDto)
                .collect(Collectors.toList());
    }

    public CustomerDTO find(Long id) {
        return customerRepository.findById(id)
                .map(this.mapper::toDto)
                .orElse(null);
    }
}
