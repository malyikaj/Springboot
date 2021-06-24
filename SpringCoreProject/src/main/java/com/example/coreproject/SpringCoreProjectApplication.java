package com.example.coreproject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ch.qos.logback.core.Context;

@SpringBootApplication
public class SpringCoreProjectApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreProjectApplication.class, args);
		System.out.println("Confirming my project is rendering to the screen");
		
		Car carOne = Context.getBean(Car.class);
		
		carOne.setColor("Black");
		carOne.setEnergy("Everything");
		carOne.setModel('Y');
		carOne.setName("Tesla");
		carOne.setSpeed("Fast!");
		carOne.setNumOfWheels(4);
		carOne.display();
	}

}

