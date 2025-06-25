package com.example.Course.Reg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Course.Reg.model.courseRegistry;


@Repository
public interface courseRegistryRepo  extends JpaRepository <courseRegistry,Integer>{

	
	
}
