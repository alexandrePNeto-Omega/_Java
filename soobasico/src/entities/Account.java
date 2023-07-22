package entities;

public class Account {
	private int numAccount;
	private String nameAccount;
	private double currentMoney;
	
	public Account(int numAccount, String nameAccount, double currentMoney) {
		this.numAccount = numAccount;
		this.nameAccount = nameAccount;
		doDeposit(currentMoney);
	}	
	
	public Account(int numAccount, String nameAccount) {
		this.numAccount = numAccount;
		this.nameAccount = nameAccount;
	}	
	
	public void doDeposit(double deposit) {
		currentMoney += deposit;
	}
	
	public void doWithdraw(double withdraw) {
		currentMoney -= (withdraw + 5.00);
	}

	public String getNameAccount() {
		return nameAccount;
	}

	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}

	public int getNumAccount() {
		return numAccount;
	}

	public double getCurrentMoney() {
		return currentMoney;
	}
	
}