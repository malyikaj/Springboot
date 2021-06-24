package com.example.coreproject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private String color;
	private char model;
	
	@Autowired
	private Vehicle vehicle;
	@Autowired
	private Speed speed;
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getModel() {
		return model;
	}

	public void setModel(char model) {
		this.model = model;
	}
	
	public void setSpeed(String speedy) {
		speed.setSpeed(speedy);
	}
	
	public void setName(String name) {
		vehicle.setName(name);
	}
	
	public void setEnergy(String energy) {
		vehicle.setEnergy(energy);
		
	}
	
	public void setNumOfWheels(int wheels) {
		vehicle.setnumofWheels(wheels);
	}
	
	public void display() {
		vehicle.display();
		speed.display();
		System.out.println("Color: " + this.color);
		System.out.println("Model: " + this.model);

	}
}