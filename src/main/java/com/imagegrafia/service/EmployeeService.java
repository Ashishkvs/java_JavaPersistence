package com.imagegrafia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagegrafia.entity.Employee;
import com.imagegrafia.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	//get emp by id
	public Optional<Employee> getEmployee(int id) {
		return employeeRepository.findAllById(id);
	}
	
	//get id by name
	public Optional<Employee> getEmployeeId(String name){
		return employeeRepository.findIdByName(name);
	}
}
