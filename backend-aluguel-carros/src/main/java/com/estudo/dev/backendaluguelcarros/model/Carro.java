package com.estudo.dev.backendaluguelcarros.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeCarro;

    private String marca;

    private String placa;

    private int ano;

    private String codRenavam;

    private float valorDiaria;

    private boolean disponibilidade;

    @OneToMany(mappedBy = "carro")
    private List<Aluguel> alugueis;
}
