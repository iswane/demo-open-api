package com.example.demoopenapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Checkout implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCheckout;

    private BigDecimal amount;

    private LocalDateTime createdAt;

    private String paymentMethod;

    @OneToOne
    private Customer customer;

    @OneToMany
    private Collection<Product> products = new ArrayList<>();
}
