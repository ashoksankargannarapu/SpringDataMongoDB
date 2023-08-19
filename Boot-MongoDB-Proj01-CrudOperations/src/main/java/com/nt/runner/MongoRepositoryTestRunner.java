package com.nt.runner;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;
@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		/*Employee e=new Employee();
		e.setEno(102);
		e.setEname("Sankar");
		e.setEadd("Chennai");
		e.setSalary(90000.0);
		e.setVaccinated(false);
		System.out.println(service.saveEmployee(e));*/
		
		//find all documents method
		//service.showAllEmployees().forEach(System.out::println);
		
		//System.out.println("Doc info::"+service.searchEmployeeById("6409eceb907a0d1158926336"));
		
		//updating the document
		//System.out.println(service.modifyEmployeeById("6409eceb907a0d1158926336", 75000.0));
		
		//remove the document
		//System.out.println(service.removeEmployeeById("6409eceb907a0d1158926336"));
		
		//find all the docs(Sorting)
		//service.showAllEmployees(true,"eadd").forEach(System.out::println);
		Employee e=new Employee();
		e.setId(UUID.randomUUID().toString());
		e.setEno(103);
		e.setEname("raju");
		e.setEadd("banglore");
		e.setSalary(90000.0);
		e.setVaccinated(true);
		System.out.println(service.saveEmployee1(e));
	}

}
