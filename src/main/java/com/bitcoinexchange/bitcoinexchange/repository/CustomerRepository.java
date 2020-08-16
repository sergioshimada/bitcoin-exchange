package com.bitcoinexchange.bitcoinexchange.repository;

import com.bitcoinexchange.bitcoinexchange.request.SaveCustomerRequest;

public interface CustomerRepository {
	
	void saveCustomer(SaveCustomerRequest request);

}
