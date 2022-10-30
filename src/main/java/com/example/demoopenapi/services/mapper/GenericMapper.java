package com.example.demoopenapi.services.mapper;

public interface GenericMapper<E, D> {

    D toDto(E entity);
    E toEntity(D dto);
}
