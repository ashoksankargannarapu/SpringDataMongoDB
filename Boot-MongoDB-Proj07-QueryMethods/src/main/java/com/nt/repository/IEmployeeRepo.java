package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee, Integer>{
	
	@Query(fields ="{ename:1,eadd:1,salary:1}",value="{eadd:?0}")
	public List<Object[]> getEmpDataByAddrs(String addrs);
	
	@Query(value="{eadd:?0}")
	public List<Employee> getEmpAllDataByAddrs(String addrs);
	
	@Query(value="{eadd:?0,ename:?1}")//where eadd=? and ename=?
	public List<Employee> getEmpAllDataByAddrsAndName(String addrs,String name);
	
	//@Query(value = "{salary:{$gte:?0,$lte:?1}}")
	@Query(value = "{salary:{$gte:?0},salary:{$lte:?1}}")  //where salary>=? and salary<=?
	public  List<Employee>  getEmpAllDataBySalaryRanage(double startSalary,double endSalary);
	
	@Query(value = "{$or:[{eadd:?0},{eadd:?1}]}")  //where  eadd=? or eadd=?
	public  List<Employee>  getEmpAllDataAddresses(String addrs1,String addrs2);
	
	@Query(value="{ename:{'$regex' : ?0, '$options' : 'i'}}")   // 'i'  for case - insensitvity is applied
	//@Query(value="{ename:{'$regex' : ?0}}")    //where ename like('%_%')  is applied
	public   List<Employee>  getEmpAllDataByEnameChars(String nameChars);
	
	
	@Query(value="{salary:{$gte:?0,$lte:?1}}",count = true)
	public int getEmpsCountBySalaryRange(double startSalary,double endSalary);
	
	@Query(value="{}",sort="{ename:1}")
	public List<Employee> showAllEmpsByEnameSorted();
	
	
	
	
}
