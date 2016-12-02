package Abstraction;

public class testEngineer {

	public static void main(String[] args) {
		
		SeleniumCourse SC=new SeleniumTraining();
		SC.learnBasicJava();
		SC.learnAdvancedJava();
		
		JavaTraining JT=new SeleniumTraining();
		JT.learnBasicJava();
		JT.learnAdvancedJava();
		JT.installJDK();
		JT.installEclipse();
		
		SeleniumTraining ST=new SeleniumTraining();
		ST.learnBasicJava();
		ST.learnAdvancedJava();
		ST.installJDK();
		ST.installEclipse();
		ST.useDropbox();
		ST.useGithub();
		
		
		

	}

}
