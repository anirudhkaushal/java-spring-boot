package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Student;

public interface StudentService {
	
	public List<Student> getStudents();
	
	public Student getStudent(long studentRoll);
	
	public void addStudent(Student student);
	
	public void deleteStudent(long rollno);
	
	public Student updateStudent(Student student);

}
