package com.bhuwan.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.bhuwan.entities.CoronaVaccine;
import com.bhuwan.service.ICoronaVaccineMgmtService;

@Order(2)
@Component
public class CrudOperationTestRunner_Select implements CommandLineRunner {
	@Autowired
	private ICoronaVaccineMgmtService service;
	
	
	@Override
	public void run(String... args) throws Exception {
		try {
		    List<CoronaVaccine> result = service.fetchAllDetails();
			result.forEach(System.out::println);
		}catch (DataAccessException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
