package com.example.Course.Reg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Course.Reg.model.course;

@Repository
public interface courseRepo extends JpaRepository<course,String> {

	
}
