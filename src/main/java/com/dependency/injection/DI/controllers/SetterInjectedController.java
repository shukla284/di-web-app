package com.dependency.injection.DI.controllers;

import com.dependency.injection.DI.services.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    @Autowired
    ServiceInterface serviceInterface;

    public void setServiceInterface(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }
    public String executeController () {
        return serviceInterface.executeService();
    }
}
