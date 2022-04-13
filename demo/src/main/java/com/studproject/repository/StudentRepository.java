package com.studproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studproject.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}
