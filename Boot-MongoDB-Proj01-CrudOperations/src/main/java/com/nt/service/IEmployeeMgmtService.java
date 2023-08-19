package com.nt.service;

import java.util.List;

import com.nt.document.Employee;

public interface IEmployeeMgmtService {
	public String saveEmployee(Employee e);
	public List<Employee> showAllEmployees();
	public String searchEmployeeById(String idVal);
	public String modifyEmployeeById(String idVal,double newSal);
	public String removeEmployeeById(String idVal);
	//Getting documents by applying sorting
	public List<Employee> showAllEmployees(boolean asc,String... properties);
	
	public String saveEmployee1(Employee e);

}
