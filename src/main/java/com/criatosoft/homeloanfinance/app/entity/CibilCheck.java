package com.criatosoft.homeloanfinance.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CibilCheck {
	@Id
	private int cibilId;
	private int cibilScore;
	private String status;
	private String remark;
	private String cibilScoreDataTime;

}
