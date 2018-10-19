package com.imagegrafia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.entity.Employee;
import com.imagegrafia.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/emp")
	public Optional<Employee> getEmployee() {
		return employeeService.getEmployee();
	}
}
