package com.nt.runner;

import java.util.Optional;
import java.util.Random;
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
		//create document object
		/*Employee e=new Employee();
		e.setEno(new Random().nextInt(10000));
		e.setEname("lokesh");
		e.setEadd("delhi");
		e.setVaccinated(true);
		e.setSalary(90000.0);
		System.out.println(service.registerEmployee(e));*/
		
		Optional<Employee> optional=service.showEmployeeById(4273);
		if(optional.isPresent())
			System.out.println("employee details::"+optional.get());
		else {
			System.out.println("Employee not found");
		}
		
	}

}
