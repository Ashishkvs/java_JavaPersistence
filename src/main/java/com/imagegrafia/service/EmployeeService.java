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
	
	public Optional<Employee> getEmployee() {
		Optional<Employee> findIdByName = employeeRepository.findIdByName("ashiah@gmail.com");
		
		System.out.println(findIdByName);
		return employeeRepository.findNameById(1);
	}
}
