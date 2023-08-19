//Parent class
package com.nt.document;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "PLAYER_OTM")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
	@Id
	private Integer pid;
	private  String pname;
	private  String country;
	private  LocalDateTime dob;
	
	//special property (HAS- A collection)
	private  Set<Sport> sportsInfo;
	private   Map<String,Medal>  medalsInfo;
	
	
	//toString()
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", country=" + country + ", dob=" + dob + "]";
	}
	

}
