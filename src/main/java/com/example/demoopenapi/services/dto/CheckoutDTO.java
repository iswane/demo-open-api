package com.example.demoopenapi.services.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckoutDTO extends EntityDTO {

    private Long idCheckout;

    private BigDecimal amount;

    private LocalDateTime createdAt;

    private String paymentMethod;

    private CustomerDTO customer;

    private Collection<ProductDTO> products = new ArrayList<>();
}
