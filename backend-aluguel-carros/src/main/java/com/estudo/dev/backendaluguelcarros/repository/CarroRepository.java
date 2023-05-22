package com.estudo.dev.backendaluguelcarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.estudo.dev.backendaluguelcarros.model.Carro;

@CrossOrigin
@RepositoryRestResource(path = "carros")
public interface CarroRepository extends JpaRepository<Carro, Long>{

    
    // @PreAuthorize("hasRole('ROLE_ADMIN')")
    // Carro save(Carro entity);

    
}
