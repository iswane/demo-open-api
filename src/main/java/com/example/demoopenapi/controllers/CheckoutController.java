package com.example.demoopenapi.controllers;

import com.example.demoopenapi.services.CheckoutService;
import com.example.demoopenapi.services.dto.CheckoutDTO;
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
@RequestMapping(value = "/api/v1/checkout")
public class CheckoutController {

    private final CheckoutService service;

    @GetMapping(value = "/all")
    public ResponseEntity<Collection<CheckoutDTO>> all() {
        log.info("Get all checkouts");
        return new ResponseEntity<>(service.all(), HttpStatus.OK);
    }

    @GetMapping(value = "/find/{id}")
    public ResponseEntity<CheckoutDTO> find(@PathVariable Long id) {
        log.info("Get checkout by ID [{}]", id);
        return new ResponseEntity<>(service.find(id), HttpStatus.OK);
    }
}
