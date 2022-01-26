package exceptions.exercise.model.application;

import java.util.Locale;
import java.util.Scanner;

import exceptions.exercise.model.entities.Account;
import exceptions.exercise.model.exceptions.DomainException;

public class Exercise {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer numberAccount = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(numberAccount, holder, initialBalance, withdrawLimit);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
			
		} catch (DomainException e) {
			System.out.println("Error in withdraw: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		} finally {
			sc.close();
		}
	}
}
