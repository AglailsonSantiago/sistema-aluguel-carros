package com.estudo.dev.backendaluguelcarros;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.estudo.dev.backendaluguelcarros.model.Aluguel;
import com.estudo.dev.backendaluguelcarros.model.Carro;
import com.estudo.dev.backendaluguelcarros.model.Cliente;
import com.estudo.dev.backendaluguelcarros.model.Endereco;

@Component
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Carro.class,Cliente.class,Aluguel.class,Endereco.class);

    }
}