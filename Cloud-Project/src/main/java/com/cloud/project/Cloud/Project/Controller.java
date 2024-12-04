package com.cloud.project.Cloud.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private StudentRepo studentRepo;

	@PostMapping("/studentAdd")
	public ResponseEntity<String> createStudent(@RequestBody Student student){
		studentRepo.save(student);
		return ResponseEntity.ok("Student data saved");
	}

}
