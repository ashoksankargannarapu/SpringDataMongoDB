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
	public String saveEmployee(Employee e) {
		return "MongoDB Doc is saved with id value:"+empRepo.insert(e).getId();
	}

	@Override
	public List<Employee> showAllEmployees() {
		return empRepo.findAll();
	}
	@Override
	public String searchEmployeeById(String idVal) {
		Optional<Employee> opt=empRepo.findById(idVal);
		if(opt.isEmpty())
			return "Document not found";
		else {
			return opt.get().toString();
		}
	}
	@Override
	public String modifyEmployeeById(String idVal, double newSal) {
		Optional<Employee> opt=empRepo.findById(idVal);
		if(opt.isEmpty())
			return "Document not found";
		else {
			Employee emp=opt.get();
			emp.setSalary(newSal);
			empRepo.save(emp);
			return "Document found and updated";
		}
	}
	@Override
	public String removeEmployeeById(String idVal) {
		Optional<Employee> opt=empRepo.findById(idVal);
		if(opt.isEmpty())
			return "Document not found";
		else {
			empRepo.deleteById(idVal);
			return "Document found and deleted";
		}	
	}
	@Override
	public List<Employee> showAllEmployees(boolean asc, String ...properties) {
		//create the sort object
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		//get the docs by sorting
		List<Employee> list=empRepo.findAll(sort);
		return list;
	}
	@Override
	public String saveEmployee1(Employee e) {
		return "MongoDB Doc is saved with id value:"+empRepo.insert(e).getId();
	}

}
