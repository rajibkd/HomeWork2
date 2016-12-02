package Polymorphism;

public class SalaryCalculation {

	public static void main(String[] args) {
		
		Salary Sal=new Salary();
	    int hourlySalary=Sal.calculateSalary(100);
	    System.out.println("Salary per Hour is :"+hourlySalary);
	    
	    int weeklySalary=Sal.calculateSalary(100,40);
	    System.out.println("Salary per Week is :"+weeklySalary);
	    
	    Salary yearlySalary=new YearlySalary();
	    int yearlysalary=yearlySalary.calculateSalary(100,40);
	    System.out.println("Salary per year is :"+yearlysalary);

	}

}
