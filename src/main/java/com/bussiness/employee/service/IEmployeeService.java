package com.bussiness.employee.service;

import java.util.List;
import java.util.Optional;

import com.bussiness.employee.entity.Employee;

public interface IEmployeeService {
	Employee createEmployee(Employee emp);
	List<Employee> getAllEmployee();
	Optional<Employee> getEmployeeById(String id);
}
