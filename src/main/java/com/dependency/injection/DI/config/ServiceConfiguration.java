package com.dependency.injection.DI.config;

import com.dependency.injection.DI.controllers.ConstructorInjectedController;
import com.dependency.injection.DI.services.ConstructorInjectionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    ConstructorInjectionService constructorInjectionService() {
        return new ConstructorInjectionService();
    }
}
