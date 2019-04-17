package com.capgemini.jpaManyToManyMapping.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpaManyToManyMapping.employee.Employee;
import com.capgemini.jpaManyToManyMapping.employee.Project;
import com.capgemini.jpaManyToManyMapping.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@RequestMapping("/")
	public void addNew() {

		Set<Project> project1 = new HashSet<Project>();
		Set<Project> project2 = new HashSet<Project>();
		Set<Project> project3 = new HashSet<Project>();

		Set<Employee> employee1 = new HashSet<Employee>();
		Set<Employee> employee2 = new HashSet<Employee>();
		Set<Employee> employee3 = new HashSet<Employee>();

		Employee emp1 = new Employee(101, "Payal");
		Employee emp2 = new Employee(102, "Ashlesha");
		Employee emp3 = new Employee(103, "Ishwari");

		Project p1 = new Project(1, "Bank");
		Project p2 = new Project(2, "Aws");
		Project p3 = new Project(3, "Python");

		employee1.add(emp1);
		employee1.add(emp2);
		employee2.add(emp3);
		employee3.add(emp1);

		p1.setEmployee(employee1);
		p2.setEmployee(employee2);
		p3.setEmployee(employee3);

		project1.add(p1);
		project2.add(p2);
		project3.add(p3);

		service.addNewEmployee(employee1);
		service.addNewEmployee(employee2);
		service.addNewEmployee(employee3);

		service.addNewProject(project1);
		service.addNewProject(project2);
		service.addNewProject(project3);

	}

	@RequestMapping("/get")
	public Set<Employee> getPerson() {
		Set<Employee> employee = new HashSet<Employee>();
		for (int i = 101; i < 104; i++) {
			employee.add(service.findPersonById(i));

		}
		return employee;
	}
}
