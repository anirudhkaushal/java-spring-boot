package com.example.demo.entities;

public class Student {
	
	private long rollNumber;
	private String name;
	private String email;
	
	public Student(long rollNumber, String name, String email) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.email = email;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	

}
