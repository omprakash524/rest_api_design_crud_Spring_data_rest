package com.rest_api_design.rest_api_design_crud.dao;

import com.rest_api_design.rest_api_design_crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

