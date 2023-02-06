package com.dependency.injection.DI.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String executeController () {
        return "Instantiated Class through Bean";
    }
}
