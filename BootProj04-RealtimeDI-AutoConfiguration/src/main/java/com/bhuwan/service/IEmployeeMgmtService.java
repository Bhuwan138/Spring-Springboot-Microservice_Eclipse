package com.bhuwan.service;

import java.util.List;

import com.bhuwan.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
	public List<EmployeeDTO> fetchEmpsByDesgs(String[] desgs) throws Exception;
}
