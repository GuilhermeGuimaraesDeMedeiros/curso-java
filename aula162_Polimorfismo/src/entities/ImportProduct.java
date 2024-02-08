package entities;

public class ImportProduct extends Product {
	private Double customsFee;

	public ImportProduct() {

	}

	public ImportProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public double totalPrice() {
		return price + customsFee;
	}

	@Override
	public String toString() {
		return name 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ "(Customs fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
	}

}
