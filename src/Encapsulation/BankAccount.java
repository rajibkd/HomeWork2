package Encapsulation;

public class BankAccount {
	
	private String bankName;
	private int accNumber;
	private String accHolderName;
	private int accBalance;
	
	public String getBankName(){
		return bankName;
	}
	
	public int getAccNumber(){
		return accNumber;
	}
	
	public String getAccHolderName(){
		return accHolderName;
	}
	
	public int getAccBalance(){
		return accBalance;
	}
	
	
	public void setBankName(String bankName){
		this.bankName=bankName;
	}
	
	public void setAccNumber(int accNumber){
		this.accNumber=accNumber;
	}
	
	public void setAccHolderName(String accHolderName){
		this.accHolderName=accHolderName;
	}
	
	public void setAccBalance(int accBalance){
		this.accBalance=accBalance;
	}

}
