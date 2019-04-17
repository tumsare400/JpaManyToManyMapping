package com.capgemini.jpaManyToManyMapping.service;

import java.util.Set;

import com.capgemini.jpaManyToManyMapping.employee.Employee;
import com.capgemini.jpaManyToManyMapping.employee.Project;

public interface EmployeeService {

	public Employee findPersonById(int id);
	void addNewEmployee(Set<Employee> employee);
	void addNewProject(Set<Project> project);
}
