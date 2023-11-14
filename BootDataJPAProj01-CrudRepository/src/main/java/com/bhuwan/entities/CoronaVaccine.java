package com.bhuwan.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CoronaVaccine implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long regNo;
	private String name;
	private String company;
	private String country;
	private Double price;
	private Integer requiredDoseCount;
}
