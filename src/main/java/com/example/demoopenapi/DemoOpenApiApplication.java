package com.example.demoopenapi;

import com.example.demoopenapi.entities.Product;
import com.example.demoopenapi.repositories.ProductRepository;
import com.example.demoopenapi.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@SpringBootApplication
public class DemoOpenApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOpenApiApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(ProductRepository repository) {
		return (args -> {
			 repository.save(new Product(null, "macBoook", new BigDecimal(1123.12), "Ordinateur", LocalDateTime.now()));
			 repository.save(new Product(null, "IPhone 14", new BigDecimal(1443.45), "Téléphone", LocalDateTime.now()));
			 repository.save(new Product(null, "Apple watch", new BigDecimal(523.23), "Montre Connecté", LocalDateTime.now()));
		});
	}
}
