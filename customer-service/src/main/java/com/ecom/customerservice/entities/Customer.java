package com.ecom.customerservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer {

    @Id @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    @Email
    private String email;
}
