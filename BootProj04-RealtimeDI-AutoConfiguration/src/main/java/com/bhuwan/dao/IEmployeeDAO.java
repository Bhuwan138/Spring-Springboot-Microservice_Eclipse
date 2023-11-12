package com.bhuwan.dao;

import java.util.List;

import com.bhuwan.bo.EmployeeBO;

public interface IEmployeeDAO {
	public List<EmployeeBO> getEmployeeByDesg(String condition) throws Exception; 
}
