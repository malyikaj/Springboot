package com.example.coreproject;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Vehicle {

	private String name;						
	private String energy;
	private int numofWheels;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnergy() {
		return energy;
	}

	public void setEnergy(String energy) {
		this.energy = energy;
	}

	public int getnumofWheels() {
		return numofWheels;
	}

	public void setnumofWheels(int numofWheels) {
		this.numofWheels = numofWheels;
	}

	public void display() {
		System.out.println("Popular Electric car");
		System.out.println("Model of car:" + this.name);
		System.out.println("Type of Energy: " + this.energy);
		System.out.println("Number of doors: " + this.numofWheels);
	}
	
}