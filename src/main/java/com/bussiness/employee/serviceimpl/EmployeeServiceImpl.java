package com.bussiness.employee.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bussiness.employee.entity.Employee;
import com.bussiness.employee.repository.IEmployeeRepository;
import com.bussiness.employee.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private IEmployeeRepository employeeRepository;
	@Override
	public Employee createEmployee(Employee emp) {
		UUID uuid = UUID.randomUUID();
		emp.setId(uuid.toString());
		return employeeRepository.save(emp);
	}
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	@Override
	public Optional<Employee> getEmployeeById(String id) {		
		return employeeRepository.findById(id);
	}
	
}
