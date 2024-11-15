package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
public class FirstController{
	
	@GetMapping("/name")
	public String Shriya()
	{
		return "Shriya Dubey";
	}
	
	@GetMapping("/demo")
	public int num1()
	{
		return 20;
	}
	
	
	@GetMapping("/student")
	public Student getStudent() 
	{
		Student s=new Student();
		s.setStud_id(101);
		s.setMarks(70);
		s.setName("Nisha");
		return s;
	}
	
	@GetMapping("/all-students")
	public List<Student> allStudents(){
		
		ArrayList<Student> students= new ArrayList<Student>();
		students.add(new Student(101, "Nisha", 80));
		students.add(new Student(102, "Shriya", 70));
		return students;
	}
	
	@GetMapping("/get-all-students")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		ArrayList<Student> students= new ArrayList<Student>();
		students.add(new Student(101, "Nisha", 80));
		students.add(new Student(102, "Shriya", 70));

		return new ResponseEntity<List<Student>>(students,HttpStatus.FOUND);
	}
	
	
	// students/anyNumber
	@GetMapping("/students/{id}")
	
	public String learnPathVariable(@PathVariable int id) 
	{
		System.out.println(id);
		return "Data Fetched Successfully";
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) 
	{
		System.out.println(student);
		return student;
		
	}
	
	
	// Status codes
	// in the postman
	// ResponseEntity<Student>  httpsStatus.created    enum is used to assign variables to numbers
	
	@PostMapping("/add-student")
	public ResponseEntity<Student> addstudentwithresponseEntity(@RequestBody Student student)
	{
		return new ResponseEntity<Student>(student,HttpStatus.UNAUTHORIZED);
	}

	
	
	
}