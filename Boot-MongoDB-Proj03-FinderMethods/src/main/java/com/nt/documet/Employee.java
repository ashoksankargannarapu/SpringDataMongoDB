package com.nt.documet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Employee_info")
@Data
public class Employee {
	@Id
	private  Integer eno;
	private  String ename;
	private   String eadd;
	private  Double salary;
	private  String email;
}
