package com.capgemini.jpaManyToManyMapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpaManyToManyMapping.employee.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {

}
