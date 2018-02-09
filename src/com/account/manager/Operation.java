package com.account.manager;

public class Operation {

	private String instant;
	private Double amount;
	private String type;

	public Operation() {

	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getInstant() {
		return instant;
	}

	public void setInstant(String instant) {
		this.instant = instant;
	}

	public Operation(String instant, Double amount, String type) {

		this.instant = instant;
		this.amount = amount;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
