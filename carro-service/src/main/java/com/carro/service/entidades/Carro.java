package com.carro.service.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value={"hibernateLazyInitializer", "handler", "fieldHandler"})
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String marca;
    private String modelo;
    private int usuarioId;
}
