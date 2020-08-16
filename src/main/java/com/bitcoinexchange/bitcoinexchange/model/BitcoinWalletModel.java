package com.bitcoinexchange.bitcoinexchange.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bitcoin_wallet")
@Getter @Setter
public class BitcoinWalletModel {

	@Id
	@GeneratedValue(generator = "bitcoinwallet_generator")
	@SequenceGenerator(
			name = "bitcoinwallet_generator",
			sequenceName = "bitcoinwallet_sequence",
			initialValue = 01
			)
	private Long id;
	
	private Double bitcoinBalance;
	
	private Double realBalance;
	
	
}
