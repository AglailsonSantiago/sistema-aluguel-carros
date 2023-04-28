package com.estudo.dev.backendaluguelcarros.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer;

@Configuration
public class IndexedParametersConfig {
    
    @Bean
    public PageableHandlerMethodArgumentResolverCustomizer pageableCustomizer() {
        return (resolver) -> {
            resolver.setOneIndexedParameters(true);
        };
    }
}
