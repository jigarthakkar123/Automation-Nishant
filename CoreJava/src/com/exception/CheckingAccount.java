package com.exception;

public class CheckingAccount {

	double balance;
	String cname;
	int acno;
	public CheckingAccount(double balance, String cname, int acno) {
		this.balance = balance;
		this.cname = cname;
		this.acno = acno;
		System.out.println("Hello "+this.cname+", Your Account Numner "+this.acno+" Is Opened With "+this.balance);
	}
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	
	public void withdraw(double amount) throws InSuficientFund{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}else {
			double needs=amount-this.balance;
			throw new InSuficientFund(needs);
		}
	}
	
	public void checkBalance() {
		System.out.println("Current Balance : "+this.balance);
	}
	
}
