package com.api.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.School;

@RestController
public class SchoolController {

	@Autowired
	private SchoolHandler schoolHandler;
	
	@PostMapping("/school")
	public School addSchool(@RequestBody School school) {
		return schoolHandler.addSchool(school);
	}
	
	@GetMapping("/school")
	public List<School> getSchools(){
		return schoolHandler.getSchools();
	}
}
