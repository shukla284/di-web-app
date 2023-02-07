package com.dependency.injection.DI.controllers;

import com.dependency.injection.DI.services.ServiceInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {
    ServiceInterface serviceInterface;

    public ProfileController(@Qualifier("ProfileService") ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }
    public String executeController () {
        return serviceInterface.executeService();
    }

}
