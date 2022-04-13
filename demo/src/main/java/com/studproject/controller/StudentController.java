package com.studproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studproject.entity.Student;

import com.studproject.service.StudentService;

@CrossOrigin("*")
@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/home")
	public List<Student> listOfStudents(){
		return service.getStudentList();
	}
	//@GetMapping("/page/{pageno}/{content}")
	
	
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return service.addNewStudent(student);
	}
	@PostMapping("/addall")
	public List<Student> addStudents(@RequestBody List<Student> student){
		return service.addNewStudents(student);
	}
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String studentDelete(@PathVariable int id) {
		return service.deleteById(id);
	}
}
