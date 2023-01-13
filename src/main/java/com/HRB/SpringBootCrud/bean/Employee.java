package com.HRB.SpringBootCrud.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	private String eid;
	private String ename;
	private int esal;
	private String ecity;
		
	public Employee() {
		super();
	}

	public Employee(String eid, String ename, int esal, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.ecity = ecity;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	
}
