package com.saroj.designpattaern.Strategy;

public class CreaditCardStratergy implements PaymentStrategy{

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	
	public CreaditCardStratergy(String name, String cardNumber, String cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}


	@Override
	public void pay(int amount) {
		
		System.out.println(amount +" paid with credit/debit card");
	}

}
