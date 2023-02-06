package com.dependency.injection.DI.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService implements ServiceInterface {
    @Override
    public String executeService() {
        return "Executing Property Injected Service";
    }
}
