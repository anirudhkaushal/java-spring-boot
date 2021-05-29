package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	List<Student> list;
	
	public StudentServiceImpl() {
		list = new ArrayList<>();
		
		list.add(new Student(111, "Anirudh", "anirudh@mail.com"));
		list.add(new Student(222, "Tom", "tom@mail.com"));
	}
	
	
	

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return list;
	}




	@Override
	public Student getStudent(long studentRoll) {
		// TODO Auto-generated method stub
		Student s = null;
		
		for(Student student:list) {
			if(student.getRollNumber() == studentRoll) {
				s = student;
				break;
			}
		}
		return s;
	}




	@Override
	public void addStudent(Student student) {
		
		list.add(student);
		System.out.println("New student added successfully");
		// TODO Auto-generated method stub
		
	}




	@Override
	public void deleteStudent(long rollno) {
		// TODO Auto-generated method stub
		Student s = null;
		
		for(Student student:list) {
			if(student.getRollNumber() == rollno) {
				s = student;
				list.remove(s);
				break;
			}
		}
		
	}




	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		Student s = null;
		
		for(Student student1:list) {
			if(student1.getRollNumber() == student.getRollNumber()) {
				s = student1;
				break;
			}
		}
		
		s.setName(student.getName());
		s.setEmail(student.getEmail());
		return s;
	}

}
