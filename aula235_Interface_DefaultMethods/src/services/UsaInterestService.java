package services;

public class UsaInterestService implements InterestService {
	private double interestRate = 1.0;

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	
	
	
	
	
}
