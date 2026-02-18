package com.ecom.customerservice;

import com.ecom.customerservice.entities.Customer;
import com.ecom.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

   @Bean
    CommandLineRunner  start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save( Customer.builder()
                    .nom("Top")
                            .prenom("Lamine")
                            .adresse( "4567 Boul Decarie HR4 56Y")
                            .email("toplam36@gmail.com").build());

            customerRepository.save( Customer.builder()
                    .nom("Diop")
                    .prenom("Sarafin")
                    .adresse( "457 Boul Martin HR8 56F")
                    .email("serafinlam34@gmail.com").build());

            customerRepository.save( Customer.builder()
                    .nom("Faye")
                    .prenom("Pape")
                    .adresse( "455 Boul Soriba HT8 56P")
                    .email("serafinlam34@gmail.com").build());
        };
    }
}
