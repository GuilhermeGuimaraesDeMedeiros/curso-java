package entities;

public class Student {
	public String name;
	public double nota1, nota2, nota3;
	
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
				
	}
	
	public String resultado() {
		if (finalGrade() >= 60.0) {
			return "PASS";
		}
		else {
			return "FAILED" + String.format("%n") + "MISSING " + String.format("%.2f ", 60.0 - finalGrade()) 
			+ "POINTS";
		 
		}
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) + resultado();  
		
	}

}
