package com.dependency.injection.DI.controllers;

import com.dependency.injection.DI.services.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    //Auto wired is not required here since the constructor is already indicating the type of the rquired param and its init.

    ServiceInterface serviceInterface;

    public ConstructorInjectedController(@Qualifier("constructorInjectionService") ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }
    public String executeController () {
        return serviceInterface.executeService();
    }
}
