package com.example.library_management.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class AutherCompositeKey {

	private String id;
	private String email;

//	public boolean equals(Object o) {
//		if(this==o) return true;
//		
//		if(o==null||getClass()!=o.getClass()) return false;
//		
//	}
}
