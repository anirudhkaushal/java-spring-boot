package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;

@RestController
public class MyController {
	
	@Autowired  //this makes the object automatically 
	private StudentService student_service;
	
	@GetMapping("/home")
	public String home() {
		return "This is the Home Page.";
	}
	
	@GetMapping("/welcome")
	public String welcomep() {
		return "This is the welcome page.";
	}
	
	// get all students details
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return this.student_service.getStudents();
		
	}
	
	// get a single student 
	@GetMapping("/students/{studentRoll}")
	public Student getStudent(@PathVariable String studentRoll) {
		return this.student_service.getStudent(Long.parseLong(studentRoll));
	}
	
	// add a student detail
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		this.student_service.addStudent(student);
	}
	
	// delete a student detail
	@DeleteMapping("/students")
	public void deleteStudent(@RequestBody long rollno) {
		this.student_service.deleteStudent(rollno);
	}
	
	// update the student detail
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return this.student_service.updateStudent(student);
	}

}
