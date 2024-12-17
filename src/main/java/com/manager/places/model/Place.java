package com.manager.places.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Place {

    @Id
    private String _id;

    @NotNull(message = "O nome não pode ser nulo")
    @NotEmpty(message = "O nome não pode estar vazio")
    private String name;

    @NotNull(message = "O endereço não pode ser nulo")
    private Address address;
}
