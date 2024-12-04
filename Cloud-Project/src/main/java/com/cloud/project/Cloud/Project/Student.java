package com.cloud.project.Cloud.Project;

import jakarta.persistence.*;

@Entity
@Table(name = "student") // Uncomment this line if you want to specify the table name
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name") // explicitly specify column names (optional if the same)
	private String name;

	@Column(name = "department") // explicitly specify column names (optional if the same)
	private String department;

	// Default constructor
	public Student() {
	}

	// Parameterized constructor
	public Student(String name, String department) {
		this.name = name;
		this.department = department;
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
}