package com.nt.service;

import java.util.List;

import com.nt.documet.Employee;

public interface IEmployeeMgmtService {
	public String saveEmployee(Employee e);
	public   List<Employee>  searchEmployeeBySalaryRange(double start, double end);
	public   Employee   searchEmployeeByEmail(String mail);
	
}
