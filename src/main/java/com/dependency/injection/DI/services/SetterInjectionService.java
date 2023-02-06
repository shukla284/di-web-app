package com.dependency.injection.DI.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectionService implements ServiceInterface {
    @Override
    public String executeService() {
        return "Executing Setter Injected Service";
    }
}
