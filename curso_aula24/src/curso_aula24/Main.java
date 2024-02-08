package curso_aula24;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int min;
		double minAdic, total;
		min = sc.nextInt();
		
		minAdic = sc.nextDouble();
		minAdic = 2.0;
		total = (min - 100) * minAdic;
		
		if (min <= 100) 
		{
			System.out.println("Valor a pagar: R$ 50.00");
		}
		else
		{
			System.out.println("Valor a pagar: R$ " + total);
		}

		
		
		

		sc.close();
		
		
		
		
	}

}
