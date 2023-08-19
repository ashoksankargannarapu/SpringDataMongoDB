package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.documet.Employee;
import com.nt.service.IEmployeeMgmtService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	 @Autowired
	private IEmployeeMgmtService  service;

	@Override
	public void run(String... args) throws Exception {
		/*Employee e=new Employee();
		e.setEno(103);
		e.setEname("Ashok");
		e.setEadd("Hyd");
		e.setSalary(60000.0);
		e.setEmail("raja@gmail.com");
		System.out.println(service.saveEmployee(e));*/
		//service.searchEmployeeBySalaryRange(10000.0, 65000.0).forEach(System.out::println);
		
		System.out.println("employee info::"+service.searchEmployeeByEmail("raja@gmail.com"));
		        
		   }

}
