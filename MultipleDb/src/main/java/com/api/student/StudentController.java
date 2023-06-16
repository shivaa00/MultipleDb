package com.api.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentHandler studentHandler;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return studentHandler.addStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> getStudents(){
		return studentHandler.getStudent();
	}
}
