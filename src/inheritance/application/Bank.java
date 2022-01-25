package inheritance.application;

import inheritance.entities.Account;
import inheritance.entities.BusinessAccount;
import inheritance.entities.SavingsAccount;

public class Bank {

	public static void main(String[] args) {
		
		//Account acc = new Account(1001, "Alex", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc;
		acc1.getBalance();
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		//Esse comando vai gerar um erro em tempo de execução.
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		//Então, tem que fazer assim...
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//Sobreposição
		Account sacc = new Account(1001, "Alex", 1000.0);
		sacc.withdraw(200.0);
		System.out.println(sacc.getBalance());
		
		Account sacc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		sacc2.withdraw(200.0);
		System.out.println(sacc2.getBalance());
		
		Account sacc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		sacc3.withdraw(200.0);
		System.out.println(sacc3.getBalance());
	}
}
