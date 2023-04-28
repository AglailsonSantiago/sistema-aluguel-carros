package com.estudo.dev.backendaluguelcarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.estudo.dev.backendaluguelcarros.model.Cliente;

@CrossOrigin
@RepositoryRestResource(path = "clientes")
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
