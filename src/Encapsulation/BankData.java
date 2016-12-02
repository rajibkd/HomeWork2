package Encapsulation;

public class BankData {

	public static void main(String[] args) {
		
		BankAccount BA=new BankAccount();
		BA.setBankName("PNC Bank");
		BA.setAccNumber(765434);
		BA.setAccHolderName("Rajib Das");
		BA.setAccBalance(10000);
		
		System.out.println(BA.getBankName()+"\n"+BA.getAccNumber()+"\n"+BA.getAccHolderName()+"\n"+BA.getAccBalance() );

	}

}
