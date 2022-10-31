package com.example.demoopenapi.services.mapper;

import com.example.demoopenapi.entities.Checkout;
import com.example.demoopenapi.services.dto.CheckoutDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CheckoutMapper extends GenericMapper<Checkout, CheckoutDTO>{
}
