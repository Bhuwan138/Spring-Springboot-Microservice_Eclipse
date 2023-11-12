package com.bhuwan.dao;

import com.bhuwan.bo.CustomerBO;

public interface ICustomerDAO {
	public int insert(CustomerBO bo) throws Exception;
}
