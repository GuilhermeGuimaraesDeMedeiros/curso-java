package util;

public class Calculator {
	public static final double IOF = 0.06;
	public static double dollarPrice;
	public static double dollarBought;

	public static double amountReais() {
		return dollarBought * IOF * dollarPrice + dollarPrice * dollarBought;
	}

	
	

}
