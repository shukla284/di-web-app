package com.dependency.injection.DI.controllers;

import com.dependency.injection.DI.services.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // This instance need to be injected before the application could run, ideally this should be the part of framework to init such an instance.
    // When such an instance is created and "wired" with the correct classes and instances then the application may be able to run correctly.
    @Autowired
    @Qualifier ("propertyInjectedService")
    public ServiceInterface serviceInterface;

    public String executeController () {
        return serviceInterface.executeService();
    }
}
