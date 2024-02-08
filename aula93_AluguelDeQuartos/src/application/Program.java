package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms wil be rented? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		String[] email = new String[n];
		int[] room = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Rent #%d:\n", i);
			System.out.print("Name: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.print("Email: ");
			email[i] = sc.nextLine();
			System.out.print("Room: ");
			room[i] = sc.nextInt();
			
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < n; i++) {
			if (name[i] != null) {
				System.out.println(room[i] + ": " + name[i] + ", " + email[i]);
			}
 		}
		
		
		
		
		
		sc.close();

	}

}
