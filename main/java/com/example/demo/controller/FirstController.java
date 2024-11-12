package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
public class FirstController{
	
	@GetMapping("/name")
	public String Shriya()
	{
		return "Shriya Dubey";
	}
	
	@GetMapping("demo")
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
}