package com.dependency.injection.DI.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service @Primary
public class ServiceInterfaceImpl implements ServiceInterface {
    @Override
    public String executeService() {
        return "Executing to the primary interface";
    }
}
