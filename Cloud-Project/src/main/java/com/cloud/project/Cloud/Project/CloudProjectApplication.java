package com.cloud.project.Cloud.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class CloudProjectApplication {

	@Autowired
	private StudentRepo studentRepo;



	@PostMapping("/addStudent")
	@ResponseBody
	public Student addStudent(@RequestBody Student student){
		Student savedStudent = studentRepo.save(student);
		return savedStudent;
	}
	@GetMapping("/getData")
	public List<Student> getStudent(){
		return studentRepo.findAll();
	}
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		studentRepo.deleteById(id);
		return "Student with ID " + id + " has been deleted.";
	}

	@DeleteMapping("/deleteAllStudents")
	public ResponseEntity<String> deleteAllStudents() {
		studentRepo.deleteAll();
		return ResponseEntity.ok("All students have been deleted.");
	}
	public static void main(String[] args) {
		SpringApplication.run(CloudProjectApplication.class, args);
	}

}
