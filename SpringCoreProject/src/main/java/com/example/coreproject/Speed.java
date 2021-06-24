package com.example.coreproject;
import org.springframework.stereotype.Component;

@Component
public class Speed {
	private String speed;

public String getSpeed() {
	return speed;
}

public void setSpeed(String noise) {
	this.speed = speed;
}

public void display() {
	System.out.println("Car Speed: " + this.speed);
}

	
}