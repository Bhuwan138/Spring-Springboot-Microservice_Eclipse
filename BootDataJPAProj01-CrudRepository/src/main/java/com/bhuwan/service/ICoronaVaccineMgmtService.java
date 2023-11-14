package com.bhuwan.service;

import java.util.List;

import com.bhuwan.entities.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	public String registerVaccine(CoronaVaccine vaccine);
	public List<CoronaVaccine> fetchAllDetails();
}
