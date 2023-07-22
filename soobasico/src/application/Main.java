package application;

import java.util.Scanner;

import entities.Account;

public class Main {

	public static void showAccout(Account acc) {
		System.out.println("\nAccount data:");
		System.out.printf("Account:"+acc.getNumAccount()
		+", Holder: "+acc.getNameAccount()
		+", Balance: %.2f", acc.getCurrentMoney());
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int numAcc = input.nextInt();
		input.nextLine();
		System.out.print("Enter account name: ");
		String nameAcc = input.nextLine();
		System.out.print("Has init deposit?: ");
		String confirmAcc = input.nextLine();
		if(confirmAcc.toUpperCase().equals("Y")) {	
			System.out.print("Enter ini deposit: ");
			double initMoneyAcc = input.nextInt();
			acc = new Account(numAcc, nameAcc, initMoneyAcc);
		} else {
			acc = new Account(numAcc, nameAcc);
		}

		showAccout(acc);
		
		System.out.println("\nDeposit value: ");
		double deposit = input.nextDouble();
		acc.doDeposit(deposit);
		System.out.println("Updated account data:");
		showAccout(acc);
		
		System.out.println("\nWithdraw value: ");
		double withdraw = input.nextDouble();
		acc.doWithdraw(withdraw);
		System.out.println("Updated account data:");
		showAccout(acc);
		
		input.close();
	}

}
