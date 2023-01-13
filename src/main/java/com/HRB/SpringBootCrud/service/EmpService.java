package com.HRB.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRB.SpringBootCrud.bean.Employee;
import com.HRB.SpringBootCrud.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	public EmpRepository empRepo;
	
	public List<Employee> getAllEmployees(){
		
		List<Employee> emp = new ArrayList<>();
		empRepo.findAll().forEach(emp::add);
		return emp;
	}
	
	public void addEmployee(Employee emp)
	{
		empRepo.save(emp);
	}
	
	public void updateEmployee(String id, Employee emp) {
		empRepo.save(emp);
	}
	
	public void deleteEmployee(String id)
	{
		empRepo.deleteById(id);
	}
}
