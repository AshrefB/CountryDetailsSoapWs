package com.ashref.soap.ws.services;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.ashref.soap.ws.countrydetails.Country;
import com.ashref.soap.ws.countrydetails.Currency;

@Service
public class CountryService {
	private static final Map<String, Country> countries = new HashMap<>();
	
	@PostConstruct
	public void init() {
		Country tunisia = new Country();
		tunisia.setName("Tunisia");
		tunisia.setCapital("Tunisia");
		tunisia.setPopulation(11434994);
		tunisia.setCurrency(Currency.TND);
		
		Country france = new Country();
		france.setName("France");
		france.setCapital("Paris");
		france.setPopulation(67022000);
		france.setCurrency(Currency.EUR);
		
		Country canada = new Country();
		canada.setName("Canada");
		canada.setCapital("Ottawa");
		canada.setPopulation(37797496);
		canada.setCurrency(Currency.CAD);
		
		countries.put("Tunisia", tunisia);
		countries.put("France", france);
		countries.put("Canada", canada);
	}
	
	public Country getCountry(String name) {
		return countries.get(name);
	}
}
