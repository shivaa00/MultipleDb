package com.api.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Teacher;
@RestController
public class TeacherController {

	@Autowired
	private TeacherHandler teacherHandler;
	
	@PostMapping("/teacher")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		return teacherHandler.addTeacher(teacher);
	}
	
	@GetMapping("/teacher")
	public List<Teacher> getTeachers(){
		return teacherHandler.getTeachers();	
	}
}
