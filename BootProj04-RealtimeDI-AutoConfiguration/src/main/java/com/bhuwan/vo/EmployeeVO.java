package com.bhuwan.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeVO{
	private String srNo;
	private String empNo;
	private String name;
	private String job;
	private String salary;
	private String deptNo;
	private String mgrNo;
}
