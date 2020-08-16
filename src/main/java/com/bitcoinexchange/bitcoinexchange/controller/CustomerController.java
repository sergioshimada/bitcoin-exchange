package com.bitcoinexchange.bitcoinexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitcoinexchange.bitcoinexchange.request.SaveCustomerRequest;
import com.bitcoinexchange.bitcoinexchange.service.CustomerService;

@RestController
@RequestMapping("/v1")
public class CustomerController {

	@Autowired
	protected CustomerService service;

	public ResponseEntity<Void> save(final SaveCustomerRequest request){

		this.service.saveCustomer(request);

		return new ResponseEntity<>(HttpStatus.OK);
	}
}
