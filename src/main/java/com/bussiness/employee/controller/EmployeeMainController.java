package com.bussiness.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bussiness.employee.entity.Employee;
import com.bussiness.employee.service.IEmployeeService;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeMainController {
	@Autowired
	private IEmployeeService empService;
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return empService.createEmployee(employee);
	}
	@GetMapping
	public List<Employee> getAllEmployee() {
		return empService.getAllEmployee();
	}
	@GetMapping(value = "/{id}")
	public Optional<Employee> getEmployee(@PathVariable String id) {
		return empService.getEmployeeById(id);
	}
}
