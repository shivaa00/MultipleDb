package com.api.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.entities.Student;

@Component
public class StudentHandler {

	@Autowired
	private StudentJpaRepo studentJpaRepo;
	
	public Student addStudent(Student student) {
		return studentJpaRepo.save(student);
	}
	
	public List<Student> getStudent(){
		return studentJpaRepo.findAll();
	}
	
}
