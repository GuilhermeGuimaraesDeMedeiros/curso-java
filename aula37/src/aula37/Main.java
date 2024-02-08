package aula37;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int min = sc.nextInt();
		double conta = 50.0;
		
	
		
		if (min <= 100) 
		{
			System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		}
		else
		{
			conta = conta + (min - 100) * 2.0;
			System.out.println("Valor a pagar: R$ " + conta);
		}
		
		sc.close();

	}

}
