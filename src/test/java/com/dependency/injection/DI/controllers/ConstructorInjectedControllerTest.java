package com.dependency.injection.DI.controllers;

import com.dependency.injection.DI.services.ServiceInterfaceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ServiceInterfaceImpl());
    }

    @Test
    void executeController() {
        assertEquals(controller.executeController(), "Executing to the interface");
    }
}