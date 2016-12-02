package Polymorphism;

public class Salary {
	
	public int calculateSalary(int salary){
		int sal=salary;
		return sal;
	}
	
	public int calculateSalary(int salary,int hours){
		int sal=salary*hours;
		return sal;
	}

}
