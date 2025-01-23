package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {
	@Autowired
	EmployeeServiceInterface service;
	
	@PostMapping("addEmp")
	public String addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
}
