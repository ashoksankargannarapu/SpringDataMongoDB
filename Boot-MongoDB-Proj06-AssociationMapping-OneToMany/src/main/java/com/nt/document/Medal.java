//Child class2
package com.nt.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "MEDAL_DETAILS")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Medal {
	@Id
	private  Integer mid;

	private  String medalType;
	private  String eventName;
	private   LocalDateTime  medalDate;
	
	
	//toString
	
	@Override
	public String toString() {
		return "Medal [mid=" + mid + ", medalType=" + medalType + ", eventName=" + eventName + ", medalDate="
				+ medalDate + "]";
	}
	

}
