package com.dependency.injection.DI.controllers;

import com.dependency.injection.DI.services.ServiceInterface;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String executeController () {
        return "Instantiated Class through Bean";
    }
}
