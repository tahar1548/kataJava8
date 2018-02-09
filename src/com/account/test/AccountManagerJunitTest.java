package com.account.test;

import org.junit.Before;
import org.junit.Test;

import com.account.manager.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class AccountManagerJunitTest {
	private List<BankAccount> accounts = new ArrayList<BankAccount>();
	private BankAccount account1 = new BankAccount(0.0);
	private BankAccount account2 = new BankAccount(0.0);
	private BankAccount account3 = new BankAccount(0.0);

	@Before
	public void setUp() {
		// add some operations
		account1.save(100.0);
		account1.retrieve(50.24);
		account1.save(11.0);
		account1.retrieve(50.24);

		account2.save(78);
		account2.retrieve(57.24);
		account2.save(100.0);
		account2.retrieve(220.24);

		account3.save(2200.0);
		account3.retrieve(50.24);
		account3.save(20.0);
		account3.retrieve(950.24);

		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
	}

	@Test
	public void getAllOperations() {
		System.out.println("############################## All operations :");

		accounts.forEach(item -> item.showHistory());

	}

	@Test
	public void getOperationsHavingPositiveAccount() {
		System.out.println("############################## operations with positive account");

		accounts.stream().filter(s -> s.getSolde() >= 0.0).forEach(item -> item.showHistory());
	}

	@Test
	public void getOperationsHavingNegativeAccount() {
		System.out.println("############################## operations with negative account");

		accounts.stream().filter(s -> s.getSolde() <= 0.0).forEach(item -> item.showHistory());
	}

}