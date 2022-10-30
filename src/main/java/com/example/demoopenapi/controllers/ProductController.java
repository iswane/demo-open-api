package com.example.demoopenapi.controllers;

import com.example.demoopenapi.entities.Product;
import com.example.demoopenapi.services.ProductService;
import com.example.demoopenapi.services.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/product")
public class ProductController {

    private final ProductService service;

    @GetMapping(value = "/all")
    public ResponseEntity<Collection<ProductDTO>> all() {
        log.info("Get all products");
        return new ResponseEntity<>(service.allProduct(), HttpStatus.OK);
    }

    @GetMapping(value = "/find/{id}")
    public ResponseEntity<ProductDTO> find(@PathVariable Long id) {
        log.info("Get all products");
        return new ResponseEntity<>(service.find(id), HttpStatus.OK);
    }
}
