package com.example.demoopenapi.services.mapper;

import com.example.demoopenapi.entities.Product;
import com.example.demoopenapi.services.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends GenericMapper<Product, ProductDTO>{
}
