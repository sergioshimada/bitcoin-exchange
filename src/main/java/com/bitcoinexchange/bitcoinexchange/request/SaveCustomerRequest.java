package com.bitcoinexchange.bitcoinexchange.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SaveCustomerRequest {

	private String cpf;
	private String name;
}
