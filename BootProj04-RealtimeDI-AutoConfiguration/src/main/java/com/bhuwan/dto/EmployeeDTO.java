package com.bhuwan.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {
	private Integer srNo;
	private Integer empNo;
	private String name;
	private String job;
	private Double salary;
	private Integer deptNo;
	private Integer mgrNo;
}
