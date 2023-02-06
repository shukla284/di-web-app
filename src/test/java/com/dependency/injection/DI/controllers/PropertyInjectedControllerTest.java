package com.dependency.injection.DI.controllers;

import com.dependency.injection.DI.services.ServiceInterface;
import com.dependency.injection.DI.services.ServiceInterfaceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.serviceInterface = new ServiceInterfaceImpl();
    }

    @Test
    void executeController() {
        assertEquals(controller.executeController(), "Executing to the interface");
    }
}