package com.api.school;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.entities.School;

@Component
public class SchoolHandler {

	@Autowired
	private SchoolJpaRepo schoolJpaRepo;
	
	public School addSchool(School school) {
		return schoolJpaRepo.save(school);
	}
	
	public List<School> getSchools(){
		return schoolJpaRepo.findAll();
	}
}
