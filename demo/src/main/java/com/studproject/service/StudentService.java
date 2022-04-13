package com.studproject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.studproject.entity.Student;
import com.studproject.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repo;
	
	public Student addNewStudent(Student student) {
		//Student sutdentdao=new Student();
		//BeanUtils.copyProperties(student, sutdentdao);
		return repo.save(student);
	}

	public List<Student> getStudentList() {
		List<Student> student=repo.findAll();
		System.out.println("getting data from db: "+ student);
		return repo.findAll();
	}

	public String deleteById(int id) {
		repo.deleteById(id);
		return "deleted";
	}

	public List<Student> addNewStudents(List<Student> student) {
		return repo.saveAll(student);
	}

	public Student updateStudent(Student student) {
		
		return repo.save(student);
	}
	
	
	
}
