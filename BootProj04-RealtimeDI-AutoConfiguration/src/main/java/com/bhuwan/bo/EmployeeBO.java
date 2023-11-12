package com.bhuwan.bo;

import lombok.Data;

@Data
public class EmployeeBO {
	private Integer empNo;
	private String name;
	private String job;
	private Double salary;
	private Integer deptNo;
	private Integer mgrNo;
}
