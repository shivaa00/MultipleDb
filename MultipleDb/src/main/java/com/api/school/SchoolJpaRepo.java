package com.api.school;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entities.School;

public interface SchoolJpaRepo extends JpaRepository<School, Long>{

	
}
