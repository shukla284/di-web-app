package com.dependency.injection.DI.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceInterfaceImpl implements ServiceInterface {
    @Override
    public String executeService() {
        return "Executing to the interface";
    }
}
