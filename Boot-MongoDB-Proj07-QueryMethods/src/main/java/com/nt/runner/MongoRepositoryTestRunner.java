package com.nt.runner;

import java.util.Iterator;
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
		/*service.showEmpDataByAddrs("delhi").forEach(row->{
		  for(Object val:row) {
			  System.out.print(val+" ");
		  }
		  System.out.println();
		});*/
		
		//service.showEmpAllDataByAddrs("Chennai").forEach(System.out::println);
		//service.showEmpAllDataByAddrsAndName("delhi","lokesh").forEach(System.out::println);
		//service.showEmpAllDataBySalaryRange(10000, 80000).forEach(System.out::println);
		//service.showEmpAllDataByAddresses("Chennai", "delhi").forEach(System.out::println);
		/*System.out.println("--------Containing----------");
		service.showEmpAllDataByEnameChars("r").forEach(System.out::println);*/
		/*System.out.println("--------Start with----------");
		service.showEmpAllDataByEnameChars("^r").forEach(System.out::println);*/
		/*System.out.println("--------Ends with----------");
		service.showEmpAllDataByEnameChars("k$").forEach(System.out::println);*/
		//System.out.println(service.fetchEmpsCountBySalaryRange(10000, 80000));
		service.fetchEmpsDataByEnameSorted().forEach(System.out::println);
	}

}
