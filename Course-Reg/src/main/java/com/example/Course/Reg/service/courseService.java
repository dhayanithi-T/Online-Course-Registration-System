package com.example.Course.Reg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Course.Reg.model.course;
import com.example.Course.Reg.model.courseRegistry;
import com.example.Course.Reg.repo.courseRegistryRepo;
import com.example.Course.Reg.repo.courseRepo;

@Service
public class courseService {

	@Autowired
	courseRepo courseRepo;
	@Autowired
	courseRegistryRepo courseRegistryRepo;
	
	public List<course> availablecourses(){
		
		return courseRepo.findAll();
		
	}
	public List<courseRegistry> enrolledStudent() {
		
		return courseRegistryRepo.findAll();
	}
	
	public void Registry (String Name,String emailId,String courseName) {
		courseRegistry courseRegistry= new courseRegistry (Name,emailId, courseName);
		 courseRegistryRepo.save(courseRegistry);
				
	}

}
