package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("What is the dollar price?");
		Calculator.dollarPrice = sc.nextDouble();
		System.out.print("How many dollars wil be bought?");
		Calculator.dollarBought = sc.nextDouble();
		
		
		
		System.out.printf("Amount to be paid in reais = %.2f", Calculator.amountReais());
		
		
				
		sc.close();		
	}

}
