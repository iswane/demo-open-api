package com.example.demoopenapi;

import com.example.demoopenapi.entities.Checkout;
import com.example.demoopenapi.entities.Customer;
import com.example.demoopenapi.entities.Product;
import com.example.demoopenapi.repositories.CheckoutRepository;
import com.example.demoopenapi.repositories.CustomerRepository;
import com.example.demoopenapi.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class DemoOpenApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoOpenApiApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(ProductRepository productRepository,
                             CustomerRepository customerRepository,
                             CheckoutRepository checkoutRepository) {
        return (args -> {
            Customer customer = new Customer(null, "Laye WANE", "demo@spring.com", "3312345678", "Part-Dieu");
            customerRepository.save(customer);

            Product p1 = new Product(null, "macBoook", new BigDecimal(1123.12), "Ordinateur", LocalDateTime.now());
            productRepository.save(p1);
            Product p2 = new Product(null, "IPhone 14", new BigDecimal(1443.45), "Téléphone", LocalDateTime.now());
            productRepository.save(p2);
            Product p3 = new Product(null, "Apple watch", new BigDecimal(523.23), "Montre Connecté", LocalDateTime.now());
            productRepository.save(p3);

            checkoutRepository.save(new Checkout(
                    null,
                    new BigDecimal("45.154"),
                    LocalDateTime.now(),
                    "CARTE",
                    customer,
                    Arrays.asList(p1, p2, p3)

            ));
        });
    }
}
