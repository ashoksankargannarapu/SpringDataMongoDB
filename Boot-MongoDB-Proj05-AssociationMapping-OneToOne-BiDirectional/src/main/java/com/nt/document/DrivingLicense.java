package com.nt.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "LICENSE_OTO")
@Setter
@Getter
public class DrivingLicense {
	@Id
   private  Integer  lno;
	private  String  licenseType;
	private  LocalDateTime  expiryDate;
	private  Person  personDetails;
	@Override
	public String toString() {
		return "DrivingLicense [lno=" + lno + ", licenseType=" + licenseType + ", expiryDate=" + expiryDate
				+ ", personDetails=" + personDetails + "]";
	}
	
	
}