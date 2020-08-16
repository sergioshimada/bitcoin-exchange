package com.bitcoinexchange.bitcoinexchange.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter @Setter
public class CustomerModel {
	
	@Id
	@GeneratedValue(generator = "customer_generator")
	@SequenceGenerator(
			name = "customer_generator",
			sequenceName = "customer_sequency",
			initialValue = 01
			)
	private Long id;

	private String name;

	private String cpf;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinTable(name = "customer_products",
	joinColumns = {
			@JoinColumn(name = "customer_id", referencedColumnName = "id",
					nullable = false, updatable = false)},
	inverseJoinColumns = {
			@JoinColumn(name = "bitcoinwallet_id", referencedColumnName = "id",
					nullable = false, updatable = false)})
	private BitcoinWalletModel bitcoinWallet;
}
