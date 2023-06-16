package com.api.teacher;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entities.Teacher;

public interface TeacherJpaRepo extends JpaRepository<Teacher, Long> {

}
