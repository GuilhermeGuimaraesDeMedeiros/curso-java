package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client client = new Client(String nome, int idade, double altura);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i +1);
			
			System.out.print("Nome: ");
			sc.nextLine();
			
			
			
		}
		
		
		
		
		
		
		sc.close();
		
	}

}
