package com.HRB.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.HRB.SpringBootCrud.bean.Employee;

public interface EmpRepository extends CrudRepository<Employee,String> {

	 
}
