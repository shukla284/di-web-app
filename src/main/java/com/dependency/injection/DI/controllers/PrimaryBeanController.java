package com.dependency.injection.DI.controllers;

import com.dependency.injection.DI.services.ServiceInterface;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeanController {

    ServiceInterface serviceInterface;

    public PrimaryBeanController(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }
    public String executeController () {
        return serviceInterface.executeService();
    }
}
