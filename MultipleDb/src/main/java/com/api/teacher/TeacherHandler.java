package com.api.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.entities.Teacher;

@Component
public class TeacherHandler {

	@Autowired
	private TeacherJpaRepo teacherJpaRepo;
	
	public Teacher addTeacher(Teacher teacher) {
		return teacherJpaRepo.save(teacher);
	}
	
	public List<Teacher> getTeachers(){
		return teacherJpaRepo.findAll();
	}
}
