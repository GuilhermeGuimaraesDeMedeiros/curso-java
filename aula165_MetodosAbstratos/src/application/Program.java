package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuintes> list = new ArrayList<>();

		System.out.print("Quantidade de Contribuintes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinte n" + i + " dados:");
			System.out.print("Pessoa Física (digite F), Pessoa Juridica (digite J): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();

			if (ch == 'f' || ch == 'F') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			if (ch == 'j' || ch == 'J') {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}

		}

		System.out.println();
		System.out.println("Imposto pago por contribuinte: ");
		for (Contribuintes contribuinte : list) {
			System.out.println(contribuinte.getNome() + " - R$ " + String.format("%.2f", contribuinte.impostoPago()));
		}
		double soma = 0.0;
		for (Contribuintes contribuinte : list) {
			
			soma += contribuinte.impostoPago();
			
		}
		System.out.println();
		System.out.println("Total de imposto arrecadado: R$ " + String.format("%.2f", soma));

		sc.close();

	}

}
