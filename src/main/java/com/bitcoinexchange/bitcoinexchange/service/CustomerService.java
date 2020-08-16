package com.bitcoinexchange.bitcoinexchange.service;

import com.bitcoinexchange.bitcoinexchange.request.SaveCustomerRequest;

public interface CustomerService {

	void saveCustomer(final SaveCustomerRequest request);
}
