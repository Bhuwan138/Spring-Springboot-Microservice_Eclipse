package com.bhuwan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhuwan.bo.EmployeeBO;
import com.bhuwan.dao.IEmployeeDAO;
import com.bhuwan.dto.EmployeeDTO;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeDAO dao;
	
	@Override
	public List<EmployeeDTO> fetchEmpsByDesgs(String[] desgs) throws Exception {
		// convert degs array into sql clouse
		StringBuilder buffer = new StringBuilder("(");
		for(int i=0;i<desgs.length;i++) {
			if(i==desgs.length-1) {
				buffer.append("'" + desgs[i] + "')");
			}else {
				buffer.append("'" + desgs[i] + "',");
			}
		}
		
		// use dao
		List<EmployeeBO> boList = dao.getEmployeeByDesg(buffer.toString());
		List<EmployeeDTO> dtoList = new ArrayList<EmployeeDTO>();
		boList.forEach(bo -> {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			// copying all the matching boList data to dtoList
			BeanUtils.copyProperties(bo, employeeDTO);
			employeeDTO.setSrNo(dtoList.size()+1);
			// adding each object of DTO class to listDTO
			dtoList.add(employeeDTO);
		});
		return dtoList;
	}// method
}// class
