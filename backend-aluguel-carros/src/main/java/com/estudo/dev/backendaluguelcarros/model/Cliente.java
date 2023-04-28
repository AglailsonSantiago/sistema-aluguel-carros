package com.estudo.dev.backendaluguelcarros.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String nome;

    private int cpf;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Endereco endereco;
    
    private int telefone;
    
    private String email;

    @OneToMany(mappedBy = "cliente")
    private List<Aluguel> alugueis;
}
