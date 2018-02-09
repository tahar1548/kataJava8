package com.account.manager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

	private double solde;
	private List<Operation> operations = new ArrayList<Operation>();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public void retrieve(double money) {
		if (money >= 0) {
			try {
				this.solde -= money;
				this.operations.add(new Operation(LocalDateTime.now().format(this.formatter), money, "RERETRIEVE"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			System.out.println("operation not denied");
	}

	public void save(double money) {
		if (money >= 0) {
			try {
				this.solde += money;
				this.operations.add(new Operation(LocalDateTime.now().format(this.formatter), money, "SAVE"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			System.out.println("operation not denied");
	}

	public void showHistory() {

		try {

			this.operations.forEach(op -> System.out
					.println(" DATE: " + op.getInstant() + " TYPE: " + op.getType() + " AMOUNT: " + op.getAmount()));
			System.out.println(" Balance: " + this.solde);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public BankAccount(double solde) {
		this.solde = solde;

	}

	public BankAccount(double solde, List<Operation> operations) {
		this.solde = solde;
		this.operations = operations;
	}

	public BankAccount() {

	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
}
