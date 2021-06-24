package com.SpringBootFirstProject.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 

public class Persons {
	//This insures that it is linked with primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	private char gender;
	
	public Persons() {
}

	public Persons(int id, String first_name, String last_name, char gender) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Persons [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender
				+ "]";
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
