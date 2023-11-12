package com.bhuwan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bhuwan.dto.CustomerDTO;
import com.bhuwan.service.ICustomerMgmtService;
import com.bhuwan.vo.CustomerVO;

@Controller("controller")
public class MainController {

	@Autowired
	private ICustomerMgmtService service;
	
	
	
	public  String  processCustomer(CustomerVO vo)throws Exception {
		//convert  VO class obj data to DTO class object data
		CustomerDTO dto=new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		//use service
		String result=service.calculateSimpleInterest(dto);
		return result;
		
	}
}
