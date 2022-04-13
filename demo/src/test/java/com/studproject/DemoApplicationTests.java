package com.studproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import java.util.stream.Collectors;

import java.util.stream.Stream;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.studproject.entity.Student;
import com.studproject.repository.StudentRepository;
import com.studproject.service.StudentService;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestInstance(Lifecycle.PER_METHOD)
class DemoApplicationTests {

	@Autowired
	private StudentService service;
	
	
	
	@MockBean
	private StudentRepository repo;
	
	@Test
	public void getListOfStudents() {
		when(repo.findAll()).thenReturn(Stream
				.of(new Student(43,"hlo",17,"male",82348973,"mettur"), new Student(44,"hlo",17,"male",58798973,"mettur")).collect(Collectors.toList()));
		assertEquals(2, service.getStudentList().size());
	}
	
	@Test
	public void saveStudentTest() {
		Student stu=new Student(45,"hlo",17,"male",82348984,"mettur");
		when(repo.save(stu)).thenReturn(stu);
		assertEquals(stu, service.addNewStudent(stu));
	}
	
	@Test
	public void deleteStudentTest() {
		//Student student=new Student(43,"hlo",17,"male",82348973,"mettur");
		service.deleteById(43);
		verify(repo, times(1)).deleteById(43);
	}
	
	@Test
	public void testUpdate() {
		Student stu=new Student(45,"hlo",17,"female",82348984,"mettur");
		when(repo.save(stu)).thenReturn(stu);
		assertEquals(stu, service.updateStudent(stu));
	}
}
