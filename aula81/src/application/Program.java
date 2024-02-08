package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client client;
		
		
		System.out.print("Enter account number: ");
		int Number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit(y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			client = new Client(Number, name, initialDeposit);
		}
		else {
			client = new Client(Number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		client.deposit(amount);
		System.out.println("Updated account data: ");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		client.withdraw(amount);
		System.out.println("Updated account data: ");
		System.out.println(client);		

		
		sc.close();
	}

}
