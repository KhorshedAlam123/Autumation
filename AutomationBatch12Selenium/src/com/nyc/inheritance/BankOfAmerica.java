package com.nyc.inheritance;

public class BankOfAmerica implements UsBank {

	@Override
	public void CheckingAccount() {
		System.out.println("BankOfAmerica Checking Deposite --1500");
		
	}

	@Override
	public void savingAccount() {
		System.out.println("BankOfAmerica Checking Deposite --1000");
		
	}

	@Override
	public void CreditAccount() {
	System.out.println("BankOfAmerica Credit Deposite --800");
		
	}

	@Override
	public void LoanAccount() {
		System.out.println("BankOfAmerica Loan Deposite --100000");
		
	}

	public static void main(String[] args) {
	   BankOfAmerica obj = new BankOfAmerica();
	   obj.CheckingAccount();
	   obj.savingAccount();
	   obj.CreditAccount();
	   obj.LoanAccount();
	}
}
