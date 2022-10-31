package com.example.demoopenapi.services.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO extends EntityDTO {

    private Long idCustomer;

    private String nameCustomer;

    private String mailCustomer;

    private String phoneCustomer;

    private String addressCustomer;
}
