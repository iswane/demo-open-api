package com.example.demoopenapi.services.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO extends EntityDTO {

    private Long idProduct;

    private String descriptionProduct;

    private BigDecimal priceProduct;

    private String categoryProduct;

    private LocalDateTime publishedDateProduct;

}
