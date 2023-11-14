package com.bhuwan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhuwan.entities.CoronaVaccine;
import com.bhuwan.repository.ICoronaVaccineRepository;

@Service("coronaService")
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepository repository;
	
	@Override
	public String registerVaccine(CoronaVaccine vaccine) {
		CoronaVaccine cv = null;
		if (vaccine != null) {			
			cv = repository.save(vaccine);
		}
		return cv!=null? "Vaccine registred successful with " + cv.getRegNo():"Vaccine registration failed";
	}

	@Override
	public List<CoronaVaccine> fetchAllDetails() {
		return (List<CoronaVaccine>) repository.findAll();
	}

}
