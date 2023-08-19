//EmployeeMgmtServiceImpl.java
package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.documet.Employee;
import com.nt.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeRepo empRepo;
	@Override
	public String saveEmployee(Employee e) {
		return "MongoDB Doc is saved with id value:"+empRepo.insert(e).getEno();
	}

	@Override
	public List<Employee> searchEmployeeBySalaryRange(double start, double end) {
		List<Employee> list = empRepo.findBySalaryBetween(start, end);
		return list;
	
	}
	
	@Override
	public Employee searchEmployeeByEmail(String mail) {
	
		return empRepo.findByEmail(mail);
	}

}// class
