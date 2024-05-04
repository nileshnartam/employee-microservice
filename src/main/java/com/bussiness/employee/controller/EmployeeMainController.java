package com.bussiness.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> exceptionInProcess(NullPointerException e) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Inter server erro : "+ e.getMessage());
	}
}
