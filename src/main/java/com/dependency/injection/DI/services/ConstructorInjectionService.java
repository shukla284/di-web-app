package com.dependency.injection.DI.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectionService implements ServiceInterface {
    @Override
    public String executeService() {
        return "Executing Constructor Injected Service";
    }
}
