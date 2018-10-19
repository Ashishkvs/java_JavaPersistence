package com.imagegrafia.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.entity.Employee;

@RestController
@RequestMapping(value="static")
public class EmployeeControllerStatic {

	@GetMapping("/emp")
	public String[] getEmployee() {
		return new String[] {"Ashish","Anupam" ,"Kaju"};
	}
	@GetMapping("/emp/map")
	public Map<String,Integer> getEmployeeMap() {
		Map<String,Integer> map=new HashMap<>();
		map.put("Ashish", 1000);
		map.put("Anupam", 2000);
		map.put("Kajal", 3000);
		map.put("Newtam", 4000);
		
		return map;
	}
	@GetMapping("/emp/array")
	public Employee[] getEmployeeArray() {
		Employee[] emp=new Employee[4];
		emp[0]=new Employee(1,"Ashish","ashishkvs@gmail.com");
		emp[1]=new Employee(4,"Newtam","ishkvs@gmail.com");
		emp[2]=new Employee(2,"Anupam","ashikvs@gmail.com");
		emp[3]=new Employee(3,"Kajal","ashkvs@gmail.com");
		

		return emp;
	}
}
