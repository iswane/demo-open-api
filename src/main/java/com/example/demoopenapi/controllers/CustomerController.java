package com.example.demoopenapi.controllers;

import com.example.demoopenapi.services.CustomerService;
import com.example.demoopenapi.services.dto.CustomerDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/customer")
public class CustomerController {

    private final CustomerService service;

    @GetMapping(value = "/all")
    public ResponseEntity<Collection<CustomerDTO>> all() {
        log.info("Get all customers");
        return new ResponseEntity<>(service.all(), HttpStatus.OK);
    }

    @GetMapping(value = "/find/{id}")
    public ResponseEntity<CustomerDTO> find(@PathVariable Long id) {
        log.info("Get customer by ID [{}]", id);
        return new ResponseEntity<>(service.find(id), HttpStatus.OK);
    }
}
