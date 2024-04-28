package com.bussiness.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bussiness.employee.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, String>{

}
