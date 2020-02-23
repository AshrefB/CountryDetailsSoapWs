package com.ashref.soap.ws.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.ashref.soap.ws.countrydetails.CountryRequest;
import com.ashref.soap.ws.countrydetails.CountryResponse;
import com.ashref.soap.ws.services.CountryService;

@Endpoint
public class CountryEndPoint {
	private static final String NAMESPACE = "http://www.ashref.com/soap/ws/countryDetails";
	@Autowired
	private CountryService service;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "CountryRequest")
	@ResponsePayload
	public CountryResponse getCountry(@RequestPayload CountryRequest request) {
		CountryResponse response = new CountryResponse();
		response.setCountry(service.getCountry(request.getName()));
		return response;
	}
}
