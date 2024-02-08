package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++ ) {
			sum += vet[i];
		}
		double media = sum / n;
		
		
		
		System.out.print("VALORES = ");
		for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vet[i]);
	    }
		
		System.out.println();
		System.out.println("SOMA = " + sum);
		System.out.println("MEDIA = " + media);
		
		sc.close();

	}

}
