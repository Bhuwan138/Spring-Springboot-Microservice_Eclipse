package com.bhuwan.repository;

import org.springframework.data.repository.CrudRepository;

import com.bhuwan.entities.CoronaVaccine;

public interface ICoronaVaccineRepository extends CrudRepository<CoronaVaccine, Long> {
	
}
