package com.nyc.inheritance;

public class TDbank implements UsBank{

	@Override
	public void CheckingAccount() {
	System.out.println("ChaseBank Checking Deposite --3000");
		
	}

	@Override
	public void savingAccount() {
	System.out.println("ChaseBank Checking Deposite --2500");
		
	}

	@Override
	public void CreditAccount() {
	System.out.println("ChaseBank Checking Deposite --1000");
		
	}

	@Override
	public void LoanAccount() {
		System.out.println("ChaseBank Checking Deposite --150000");
		
	}
	public static void main(String[] args) {
		ChaseBank obj = new ChaseBank();
		obj.CheckingAccount();
		obj.savingAccount();
		obj.CreditAccount();
		obj.LoanAccount();
	}

}
