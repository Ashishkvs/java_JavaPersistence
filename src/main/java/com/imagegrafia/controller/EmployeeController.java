package com.imagegrafia.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.entity.Employee;
import com.imagegrafia.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/emp/{id}")
	public Optional<Employee> getEmployee(@PathVariable("id")int id) {
		System.out.println(id);
		
		return employeeService.getEmployee(id);
	}
}
