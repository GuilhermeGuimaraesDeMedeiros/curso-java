package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installments;
import model.service.ContractService;
import model.service.PaypalPaymentService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();

		Contract obj = new Contract(number, date, totalValue);

		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalPaymentService());
		contractService.processContract(obj, n);

		System.out.println("Parcelas:");
		for (Installments installments : obj.getInstallments()) {
			System.out.println(installments);
		}

		sc.close();
	}

}
