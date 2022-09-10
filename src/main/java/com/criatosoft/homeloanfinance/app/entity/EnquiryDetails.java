package com.criatosoft.homeloanfinance.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnquiryDetails {
	@Id
	private int cid;
	private String name;
	private long contactNo;
	private String email;
	private String pancard;
	

}
