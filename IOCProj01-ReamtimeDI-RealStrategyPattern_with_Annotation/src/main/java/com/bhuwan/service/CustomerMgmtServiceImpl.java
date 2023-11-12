package com.bhuwan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bhuwan.bo.CustomerBO;
import com.bhuwan.dao.ICustomerDAO;
import com.bhuwan.dto.CustomerDTO;

@Service("custMgmtService")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	@Autowired
	@Qualifier("dao")
	private ICustomerDAO dao;
	
	@Override
	public String calculateSimpleInterest(CustomerDTO dto) throws Exception {
		float intrAmt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		//create BO class obj having persistable data
		CustomerBO bo=new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setInterestAmount(intrAmt);
		//use DAO
		int count=dao.insert(bo);
		  // terinary operator   <condition>?<sucess>:<failure>
		return  count==1?"Customer registered sucessfully---> SimpleIntrest amount::"+intrAmt:"Customer registration failed";  
	}

}
