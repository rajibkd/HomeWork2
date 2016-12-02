package Polymorphism;

public class YearlySalary extends Salary {
	
	public int calculateSalary(int salary,int hours){
		int yearlysalary=salary*hours*52;
		return yearlysalary;
	}

}
