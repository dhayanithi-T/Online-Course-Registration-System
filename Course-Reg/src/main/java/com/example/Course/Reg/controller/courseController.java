package com.example.Course.Reg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Course.Reg.model.course;
import com.example.Course.Reg.model.courseRegistry;
import com.example.Course.Reg.service.courseService;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500")
public class courseController {
	
	@Autowired
	courseService courseService;
	
	
	@GetMapping("/courses")
	public List<course> availablecourses(){
		return courseService.availablecourses();		
	}
	
	@GetMapping("/courses/enrolled")
	 public List<courseRegistry> enrolledStudent(){
	 return courseService.enrolledStudent();
	 
	  }
	 
	 @PostMapping("/courses/register")
	 public String Register(@RequestParam ("Name")String Name,
			 				@RequestParam("emailId") String emailId,
			 				@RequestParam("courseName")String courseName) {
		 
		 courseService.Registry(Name,emailId,courseName);
              return "CONGRATULATIONS!...  "+Name+"  Enrolled Successfull for "+ courseName +"  Course"; 
	
	 }
	 	 

}
