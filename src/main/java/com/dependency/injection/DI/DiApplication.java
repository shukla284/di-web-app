package com.dependency.injection.DI;

import com.dependency.injection.DI.controllers.ConstructorInjectedController;
import com.dependency.injection.DI.controllers.MyController;
import com.dependency.injection.DI.controllers.PropertyInjectedController;
import com.dependency.injection.DI.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		var springContext = SpringApplication.run(DiApplication.class, args);
		var controllerObject = (MyController) springContext.getBean("myController");

		System.out.println("Executing Bean: " + controllerObject.executeController());

		// Spring intializes and manages the components which are registered with the spring.
		// If spring doesn't knows about the component or more effectively class then it would be initialized, indexed and injected into the spring application at the correct places.

		var propertyInjectedController = (PropertyInjectedController) springContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.executeController());

		var setterInjectedController = (SetterInjectedController) springContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.executeController());

		var constructorInjectedController = (ConstructorInjectedController) springContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.executeController());
	}

}
