package com.bhuwan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bhuwan.dto.EmployeeDTO;
import com.bhuwan.service.IEmployeeMgmtService;
import com.bhuwan.vo.EmployeeVO;

@Controller("controller")
public class MainController {
	@Autowired
	private IEmployeeMgmtService service;
	
	public List<EmployeeVO> showEmpsByDesgs(String []desgs) throws Exception{
		// use service
		List<EmployeeDTO> dtoList =  service.fetchEmpsByDesgs(desgs);
		
		// convert dto to vo
		List<EmployeeVO> voList = new ArrayList<EmployeeVO>();
		dtoList.forEach(dto -> {
			EmployeeVO vo = new EmployeeVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setSrNo(String.valueOf(dto.getSrNo()));
			vo.setEmpNo(String.valueOf(dto.getEmpNo()));
			vo.setSalary(String.valueOf(dto.getSalary()));
			vo.setDeptNo(String.valueOf(dto.getDeptNo()));
			vo.setMgrNo(String.valueOf(dto.getMgrNo()));
			
			// adding vo class to list of vo
			voList.add(vo);
		});
		
		return voList;
	}// method
}// class
