package com.example.demoopenapi.services.mapper;

import com.example.demoopenapi.entities.Customer;
import com.example.demoopenapi.services.dto.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends GenericMapper<Customer, CustomerDTO>{
}
