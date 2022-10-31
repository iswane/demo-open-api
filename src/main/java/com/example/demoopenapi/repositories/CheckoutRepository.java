package com.example.demoopenapi.repositories;

import com.example.demoopenapi.entities.Checkout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends CrudRepository<Checkout, Long> {
}
