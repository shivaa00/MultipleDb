package com.api.student;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entities.Student;

public interface StudentJpaRepo extends JpaRepository<Student, Long>{

}
