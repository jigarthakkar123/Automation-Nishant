package com.exception;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		double amount;
		Scanner sc=new Scanner(System.in);
		CheckingAccount c=new CheckingAccount(1000, "Jigar", 101);
		
		while(true)
		{
			System.out.println("**************************************************************");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("**************************************************************");
			System.out.print("Enter Your Choice : ");
			int choice=sc.nextInt();
			System.out.println("**************************************************************");
			if(choice==1)
			{
				System.out.print("Enter Deposit Amount : ");
				amount=sc.nextDouble();
				c.deposit(amount);
				System.out.println("**************************************************************");
			}
			else if(choice==2)
			{
				System.out.print("Enter Withdraw Amount : ");
				amount=sc.nextDouble();
				try {
					c.withdraw(amount);
					System.out.println("**************************************************************");
				}catch(InSuficientFund e) {
					System.out.println("Sorry You Need Anothe "+e.getAmount()+" Rs.");
					System.out.println("**************************************************************");
				}
			}
			else if(choice==3)
			{
				c.checkBalance();
				System.out.println("**************************************************************");
			}
			else
			{
				System.out.println("Good Bye");
				break;
			}
		}
	}
}
