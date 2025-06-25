package com.example.Course.Reg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class courseRegistry {
	
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int Id;// no need provide value
	
	
private String Name;
private String emailId;
private String courseName;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public courseRegistry(String name, String emailId, String courseName) {
	super();
	
	Name = name;
	this.emailId = emailId;
	this.courseName = courseName;
}


public courseRegistry() {
	
}

	
}
