package com.bhuwan.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.bhuwan.entities.CoronaVaccine;
import com.bhuwan.service.ICoronaVaccineMgmtService;
@Order(1)
@Component
public class CrudOperationTestRunner_Insert implements CommandLineRunner {
	@Autowired
	private ICoronaVaccineMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			CoronaVaccine coronaVaccine = new CoronaVaccine();
			coronaVaccine.setName("varosil");
			coronaVaccine.setCompany("Chung");
			coronaVaccine.setCountry("China");
			coronaVaccine.setPrice(700.0);
			coronaVaccine.setRequiredDoseCount(2);
			String result = service.registerVaccine(coronaVaccine);
			System.out.println(result);
		}catch (DataAccessException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
