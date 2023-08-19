package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepo;
@Service("empService")
public class IEmployeeMgmtServiceImpl implements IEmployeeMgmtService{

	@Autowired
	private IEmployeeRepo empRepo;
	
	@Override
	public List<Object[]> showEmpDataByAddrs(String addrs) {
		return empRepo.getEmpDataByAddrs(addrs);
	}
	@Override
	public List<Employee> showEmpAllDataByAddrs(String addrs) {
		return empRepo.getEmpAllDataByAddrs(addrs);
	}
	@Override
	public List<Employee> showEmpAllDataByAddrsAndName(String addrs, String name) {
		return empRepo.getEmpAllDataByAddrsAndName(addrs, name);
	}
	@Override
	public List<Employee> showEmpAllDataBySalaryRange(double start, double end) {
		return empRepo.getEmpAllDataBySalaryRanage(start, end);
	}
	@Override
	public List<Employee> showEmpAllDataByAddresses(String add1, String add2) {
		return empRepo.getEmpAllDataAddresses(add1, add2);
	}
	@Override
	public List<Employee> showEmpAllDataByEnameChars(String initialChars) {
		return empRepo.getEmpAllDataByEnameChars(initialChars);
	}
	@Override
	public int fetchEmpsCountBySalaryRange(double startSalary, double endSalary) {
		return empRepo.getEmpsCountBySalaryRange(startSalary, endSalary);
	}
	@Override
	public List<Employee> fetchEmpsDataByEnameSorted() {
		return empRepo.showAllEmpsByEnameSorted();
	}
}
