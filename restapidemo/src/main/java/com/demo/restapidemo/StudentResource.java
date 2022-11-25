package com.demo.restapidemo;


//import java.util.Arrays;
import java.util.List;

//import javax.print.attribute.standard.Media;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudentResource
{
	StudentRepository sr=new StudentRepository();
 @GET
 @Produces(MediaType.APPLICATION_XML)
 public List<Student> getStudent()
	{
	 System.out.println("Student Called.....");
	 
	 List<Student> student = sr.getStudent();
	 return student;
 }
}
