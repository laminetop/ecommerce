package com.ecom.inventoryservice;

import com.ecom.inventoryservice.entities.Product;
import com.ecom.inventoryservice.reporitories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .nom("ordinateur portable")
                    .price(1240.0)
                    .quantite(11).build());

            productRepository.save(Product.builder()
                    .nom("Ipad SamsungGalaxy")
                    .price(900.0)
                    .quantite(5).build());

            productRepository.save(Product.builder()
                    .nom("Imprimante Lazer Epson")
                    .price(600)
                    .quantite(15).build());
        };
    }
}
