package com.example.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.bean.Student;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent()
	{
	Student student =new Student (1,"ram","kumar");
	return student;
	}
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> students=new  ArrayList<>();
		Student s1 =new Student (1,"ravi","kumar");
		Student s2 =new Student (2,"vijay","kumar");
		Student s3 =new Student (3,"dinesh","kumar");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		return students;
		
	}
	@GetMapping("/students/{id}")
	public Student studentpathvariable( @PathVariable int id)
	{
		return new Student(id,"saurabh","kumar");
	}
	@PostMapping("/student/create")
	public Student createstudent(@RequestBody Student student)
	{
		System.out.println(student.getId());

		System.out.println(student.getFirstname());

		System.out.println(student.getLastname());
		return student;
	}
	
	@PutMapping("/student/{id}")
	public Student updatestudent(@RequestBody Student student,@PathVariable int id)
	{
		

		System.out.println(student.getFirstname());

		System.out.println(student.getLastname());
		return student;
	}
	
	@DeleteMapping("/student/{id}")
	public String deletestudent(@PathVariable int id)
	{
		System.out.println(id);
		return "student deleted successfully";
	}
}

