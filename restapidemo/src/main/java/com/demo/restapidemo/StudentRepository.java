package com.demo.restapidemo;

import java.util.*;

public class StudentRepository
{
	List<Student> stud;
	public StudentRepository()
	{
		stud=new ArrayList<>();
		Student s=new Student();
		
		 s.setName("Grace");
		 s.setRno(20);
		 s.setMark(50);
		 
		 Student s1=new Student();
			
		 s1.setName("Suriya");
		 s1.setRno(30);
		 s1.setMark(60);
		 
		 stud.add(s);
		 stud.add(s1);
	}
	public List<Student> getStudent(){
		System.out.println("Hello");
		return stud;
		
	}
}
