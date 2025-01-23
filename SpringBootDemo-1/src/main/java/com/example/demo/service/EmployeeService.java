package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService implements EmployeeServiceInterface {
	@Autowired
	EmployeeRepo empRepo;

	@Override
	public String addEmployee(Employee employee) {
		Employee emp=empRepo.save(employee);
		if(emp!=null) {
			return "ADDED";
		}
		else 
			return "NotAdded";
	}
	
}
