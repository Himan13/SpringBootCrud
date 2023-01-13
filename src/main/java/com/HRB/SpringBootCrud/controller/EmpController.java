package com.HRB.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.HRB.SpringBootCrud.service.EmpService;
import com.HRB.SpringBootCrud.bean.Employee;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){
		
	return empService.getAllEmployees();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee emp) {
		empService.addEmployee(emp);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/employees/{id}")
	public void updateEmployee(@PathVariable String id, @RequestBody Employee emp) {

		empService.updateEmployee(id, emp);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/employees/{id}")
	public void deleteEmployee(@PathVariable String id) {
		empService.deleteEmployee(id);
	}
}
