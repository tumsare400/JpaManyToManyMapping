package com.capgemini.jpaManyToManyMapping.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpaManyToManyMapping.dao.EmployeeDao;
import com.capgemini.jpaManyToManyMapping.dao.ProjectDao;
import com.capgemini.jpaManyToManyMapping.employee.Employee;
import com.capgemini.jpaManyToManyMapping.employee.Project;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Autowired
	private ProjectDao pdao;
	
	@Override
	public Employee findPersonById(int id) {
		Employee employee = dao.findById(id).get();
		return employee;
	}

	@Override
	public void addNewEmployee(Set<Employee> employee) {
		dao.saveAll(employee);
		
	}

	@Override
	public void addNewProject(Set<Project> project) {
		pdao.saveAll(project);
	}

}
