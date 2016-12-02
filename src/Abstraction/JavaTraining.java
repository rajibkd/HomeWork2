package Abstraction;

public abstract class JavaTraining implements SeleniumCourse {
	
	public void learnBasicJava(){
		System.out.println("We are going to learn Basic Java");
	}
	
	public void learnAdvancedJava(){
		System.out.println("We are going to learn Advanced Java");
	}
	
	public abstract void installJDK();
	
	public abstract void installEclipse();

}
