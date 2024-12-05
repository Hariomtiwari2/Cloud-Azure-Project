package com.cloud.project.Cloud.Project;

import jakarta.persistence.*;

@Entity
@Table(name = "student") // Specifying the table name explicitly
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name", nullable = false) // Adding constraints like NOT NULL
	private String name;

	@Column(name = "department", nullable = false)
	private String department;

	@Column(name = "age") // New field
	private Integer age;

	@Column(name = "phone_number", length = 15) // New field
	private String phoneNumber;

	@Column(name = "email", unique = true) // New field with unique constraint
	private String email;

	// Default constructor
	public Student() {
	}

	// Parameterized constructor
	public Student(String name, String department, Integer age, String phoneNumber, String email) {
		this.name = name;
		this.department = department;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
