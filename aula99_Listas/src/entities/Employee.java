package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void increaseSalary(double porcentagem) {
		salary = salary * (porcentagem/100 +1);
	}
	
	public String toString() {
		return id
				+ ", "
				+ name 
				+ ", "
				+ String.format("%.2f", salary);
		
				
	}
	

}
