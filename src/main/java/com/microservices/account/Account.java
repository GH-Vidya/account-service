package com.microservices.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Account {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Size(min = 1)
	private String accountName;

	@NotNull
	@Size(min = 1)
	private String accountNumber;

}
