package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "PERSON_OTO")
@Setter
@Getter
public class Person {
	@Id
	private  Integer pid;
	private  String pname;
	private  String addrs;
    private  DrivingLicense licenseDetails;
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + ", licenseDetails=" + licenseDetails
				+ "]";
	}
    
    
}