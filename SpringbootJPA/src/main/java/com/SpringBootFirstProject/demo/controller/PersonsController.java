package com.SpringBootFirstProject.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootFirstProject.demo.exception.ResourceNotFoundException;
import com.SpringBootFirstProject.demo.model.Persons;
import com.SpringBootFirstProject.demo.repository.PersonRepository;
 

@RestController
@RequestMapping("/api")

public class PersonsController {
	@Autowired
	
	private PersonRepository personRepo;
	@GetMapping("/persons")
	public List<Persons> getAllPersons() {
		return personRepo.findAll();
		
	}
	@GetMapping("/persons/{id}")
	public ResponseEntity<Persons>getPersonId(@PathVariable int id){
		  
		Persons person = personRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Not found!"));
		
		return ResponseEntity.ok(person);
	}
	@PostMapping("/persons")
	public Persons newPerson(@RequestBody Persons p) {
		return personRepo.save(p);
	}
	
//	@PutMapping("/student/{id}")
//	public ResponseEntity<Student>updateStudent(@PathVariable int id, @RequestBody Student student)
//	{
//		Student s= student.Repo.findById(id.orElseThrow(() -> new ResourceNotFoundException("Student not found"));
//		s.setName(student.getName());
//		s.setGrade(student.getGrade());
//		Student updatedStudent=studentRepo.
//	}
//	
//	@DeleteMapping("/student/{id}")
//	public String deletePersons(@PathVariable)
//	
	
	
//	@GetMapping("/students/{name}")
//	public List<Student> getStudentByName(@PathVariable String name)
//	{
//		return studentRepo.findByName(name);
//	}
}
